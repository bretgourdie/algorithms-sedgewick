package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class VisualCounter
{
    private final int max;
    private int value;
    private int[] plot;
    private int numOperations;

    public VisualCounter(int N, int max)
    { 
	plot = new int[N];
	this.max = max;
    }

    public int tally()
    {
	return value;
    }

    public void increment()
    {
	affectValue(1);
    }

    public void decrement()
    {
	affectValue(-1);
    }

    public void affectValue(int addition)
    {
	int newValue = this.value + addition;

	boolean withinMax = Math.abs(newValue) <= max;
	boolean withinOps = numOperations < plot.length;

	if (withinMax && withinOps)
	{
	    plot[numOperations++] = value;
	    value = newValue;
	}
    }

    public void plot()
    {
	for (int ii = 0; ii < numOperations; ii++)
	{
	    StdOut.println(ii + ": " + plot[ii]);
	}
	StdOut.println(numOperations + ": " + this.value);
    }

    public String toString()
    {
	return "Tally: " + tally() 
	    + "; " + numOperations + "/" + plot.length
	    + "; max: " + max;
    }
}
