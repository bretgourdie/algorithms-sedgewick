package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise15
{
    public static void main (String[] args)
    {
	Queue<String> q = new Queue<String>();

	int k = Integer.parseInt(args[0]);
	int total = 0;

	while (!StdIn.isEmpty())
	{
	    q.enqueue(StdIn.readString());
	    total++;
	}

	if (!q.isEmpty())
	{
	    String curString = q.dequeue();
	    for (int ii = 0; ii < total - k - 1; ii++)
	    {
		curString = q.dequeue();
	    }

	    StdOut.println(k + "th String from the end is " + curString);
	}
    }
}
