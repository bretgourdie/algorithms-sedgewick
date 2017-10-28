package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise16
{
    public static void main (String[] args)
    {
	Date[] dates = readDates(args[0]);

	for (Date date : dates)
	{
	    StdOut.println(date);
	}
    }

    public static Date[] readDates(String name)
    {
	In in = new In(name);
	Queue<String> q = new Queue<String>();
	while (!in.isEmpty())
	    q.enqueue(in.readString());

	int N = q.size();
	Date[] a = new Date[N];
	for (int i = 0; i < N; i++)
	    a[i] = new Date(q.dequeue());
	return a;
    }
}
