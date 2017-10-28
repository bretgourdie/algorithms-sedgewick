package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise14
{
    public static void main (String[] args)
    {
	testQueueEmpty();
	testQueueFull();
	testOverFill();
	testQueueWrapAround();
    }

    public static void testQueueEmpty()
    {
	StdOut.println("testQueueEmpty()");
	ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();
	StdOut.println(q);
    }

    public static void testQueueFull()
    {
	StdOut.println("testQueueFull()");
	ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();

	StdOut.println("Queueing:");
	for (int ii = 0; ii < 10; ii++)
	{
	    StdOut.println("\t" + ii);
	    q.enqueue(Integer.toString(ii));
	}

	StdOut.println(q);
    }

    public static void testQueueWrapAround()
    {
	StdOut.println("testQueueWrapAround()");
	ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();

	StdOut.println("Queueing:");
	for (int ii = 0; ii < 3; ii++)
	{
	    StdOut.println("\t" + ii);
	    q.enqueue(Integer.toString(ii));
	}

	StdOut.println("Dequeueing:");
	for (int ii = 0; ii < 2; ii++)
	{
	    StdOut.println("\t" + q.dequeue());
	}

	StdOut.println("Queueing:");
	for (int ii = 3; ii < 3+5; ii++)
	{
	    StdOut.println("\t" + ii);
	    q.enqueue(Integer.toString(ii));
	}

	StdOut.println(q);
    }

    public static void testOverFill()
    {
	StdOut.println("testOverFill()");
	ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();

	StdOut.println("Queueing:");
	for (int ii = 0; ii < 5; ii++)
	{
	    StdOut.println("\t" + ii);
	    q.enqueue(Integer.toString(ii));
	}

	StdOut.println(q);
    }
}
