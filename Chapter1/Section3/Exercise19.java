package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise19
{
    public static void main (String[] args)
    {
	Node<Integer> first = new Node<Integer>();
	Node<Integer> second = new Node<Integer>();
	Node<Integer> third = new Node<Integer>();

	first.item = 1;
	second.item = 2;
	third.item = 3;

	first.next = second;
	second.next = third;

	print("Unaltered", first);
	removeLast(first);
	print("After removal", first);
    }

    public static void print(String preamble, Node<Integer> first)
    {
	Node<Integer> curNode = first;

	StdOut.println(preamble);
	do
	{
	    if (curNode != null)
	    {
		StdOut.println("\t" + curNode.item);
		curNode = curNode.next;
	    }
	} while (curNode != null);
    }

    public static void removeLast(Node<Integer> first)
    {
	Node<Integer> curNode = first;

	while (curNode.next != null && curNode.next.next != null)
	    curNode = curNode.next;

	curNode.next = null;
    }

}
