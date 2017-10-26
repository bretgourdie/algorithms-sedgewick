package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise02
{
    public static void main (String[] args)
    {
	int N = Integer.parseInt(args[0]);

	Interval1D[] intervals = new Interval1D[N];

	for (int next = 0; next < N; next++)
	{
	    double x = StdIn.readDouble();
	    double y = StdIn.readDouble();

	    intervals[next] = new Interval1D(x, y);

	    for (int prev = next - 1; prev >= 0; prev--)
	    {
		if (intervals[next].intersects(intervals[prev]))
		{
		    StdOut.println(
			intervals[next]
			+ " intersects with "
			+ intervals[prev]);
		}
	    }
	}
    }
}
