package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise20
{
    private static String alphabetList = "abcdefghijklmnopqrstuvwxyz";
    public static void main (String[] args)
    {
	testFront();
	testMiddle();
	testBack();
    }

    public static void testFront()
    {
	runTestAndDeleteAt(10, 0);
    }

    public static void testMiddle()
    {
	runTestAndDeleteAt(10, 5);
    }

    public static void testBack()
    {
	runTestAndDeleteAt(10, 9);
    }

    public static void runTestAndDeleteAt(int N, int k)
    {
	Node<String> list = generateList(N);

	printList("Unaltered:", list);

	list = delete(list, k);

	printList("Deleted at " + k + ":", list);
    }

    public static Node<String> generateList(int n)
    {
	Node<String> list = null;
	
	if (n > 0)
	{
	    list = new Node<String>();
	    list.item = new String("a");
	    Node<String> cur = list;

	    for (int ii = 1; ii < n; ii++)
	    {
		Node<String> next = new Node<String>();
		next.item = new String(alphabetList.substring(ii, ii+1));
		cur.next = next;

		cur = next;
	    }
	}

	return list;
    }

    public static void printList(String preamble, Node<String> first)
    {
	Node<String> cur = first;

	StdOut.println(preamble);

	do
	{
	    if (cur != null)
	    {
		StdOut.println("\t" + cur.item);
		cur = cur.next;
	    }
	} while (cur != null);
    }

    public static Node<String> delete(Node<String> first, int k)
    {
	if (first == null)
	    return null;

	if (k == 0)
	{
	    return first.next;
	}
	Node<String> cur = first;

	while (cur != null && k > 1)
	{
	    cur = cur.next;
	    k--;
	}

	if (k == 1 && cur.next != null)
	{
	    cur.next = cur.next.next;
	}

	return first;
    }
}   

