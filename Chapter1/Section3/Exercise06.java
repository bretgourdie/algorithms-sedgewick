package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise06
{
    public static void main (String[] args)
    {
	Queue<String> q = new Queue<String>();
	q.enqueue("a");
	q.enqueue("b");
	q.enqueue("c");
	mystery(q);

	StdOut.print(q);
    }

    // Reverses the queue
    public static void mystery(Queue<String> q)
    {
	Stack<String> stack = new Stack<String>();
	while (!q.isEmpty())
	    stack.push(q.dequeue());
	while (!stack.isEmpty())
	    q.enqueue(stack.pop());
    }
} 
