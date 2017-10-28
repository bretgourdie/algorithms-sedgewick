package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class ResizingArrayQueueOfStrings
{
    String[] q;
    int start;
    int end;
    int count;

    public ResizingArrayQueueOfStrings(int size)
    {
	q = new String[size];
	count = 0;
    }

    public void enqueue(String toQ)
    {
	if (isFull())
	    return;
	
	q[end] = toQ;
	end = (end + 1) % q.length;
	count++;
    }

    public String dequeue()
    {
	if (isEmpty())
	    return null;

	count--;
	String dqd = q[start];

	start = (start + 1) % q.length;

	return dqd;
    }

    public boolean isEmpty()
    {
	return count == 0;
    }

    public boolean isFull()
    {
	return count == q.length;
    }

    public String toString()
    {
	StringBuilder sb = new StringBuilder();

	sb.append("Queue:");
	for(int ii = 0; ii < count; ii++)
	{
	    int index = (start + ii) % q.length;
	    sb.append("\n\t" + ii + " [" + index + "]: " + q[index]);
	}

	return sb.toString();
    }
}
