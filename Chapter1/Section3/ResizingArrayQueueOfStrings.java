package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class ResizingArrayQueueOfStrings
{
    String[] q;
    int start;
    int end;
    int count;
    private final int initialSize = 5;

    public ResizingArrayQueueOfStrings()
    {
	q = new String[initialSize];
	count = 0;
    }

    private void resize(int max)
    {
	String[] temp = new String[max];

	for (int ii = 0; ii < count; ii++)
	{
	    temp[ii] = q[ii];
	}

	q = temp;
    }

    public void enqueue(String toQ)
    {
	if (isFull())
	    return;

	if (count == q.length)
	    resize(2 * q.length);
	
	q[end] = toQ;
	end = (end + 1) % q.length;
	count++;
    }

    public String dequeue()
    {
	if (isEmpty())
	    return null;

	if (count > 0 && count == q.length / 4)
	    resize(q.length / 2);

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
