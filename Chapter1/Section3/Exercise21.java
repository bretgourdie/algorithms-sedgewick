package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise21
{
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main (String[] args)
    {
	Node<String> list = generateList(10);
	String firstTest = "b";
	String secondTest = "z";

	System.out.println(
	    "Found \""
	    + firstTest
	    + "\"? "
	    + find(list, firstTest)
	    + "; found \""
	    + secondTest
	    + "\"? "
	    + find(list, secondTest));
    }

    public static Node<String> generateList(int N)
    {
	if (N == 0)
	    return null;

	Node<String> start = new Node<String>();
	start.item = new String("a");
	Node<String> cur = start;

	for (int ii = 1; ii < N; ii++)
	{
	    Node<String> next = new Node<String>();
	    next.item = new String(alphabet.substring(ii, ii+1));
	    cur.next = next;
	    cur = next;
	}

	return start;
    }

    public static boolean find (Node<String> list, String key)
    {
	if (list == null)
	    return false;

	return key.equals(list.item) || find(list.next, key);
    }
}
