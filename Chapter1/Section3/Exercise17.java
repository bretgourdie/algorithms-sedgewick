package Chapter1.Section3;

import edu.princeton.cs.algs4.*;
import Chapter1.Section2.Transaction;

public class Exercise17
{
    public static void main (String[] args)
    {
	Transaction[] transactions = readTransactions(args[0]);

	for (Transaction transaction : transactions)
	{
	    StdOut.println(transaction);
	}
    }

    public static Transaction[] readTransactions(String name)
    {
	In in = new In(name);
	Queue<String> q = new Queue<String>();
	while (!in.isEmpty())
	    q.enqueue(in.readLine());

	int N = q.size();
	Transaction[] a = new Transaction[N];
	for (int i = 0; i < N; i++)
	    a[i] = new Transaction(q.dequeue());
	return a;
    }
}
