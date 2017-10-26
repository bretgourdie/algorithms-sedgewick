package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise03
{
    public static void main (String[] args)
    {
	int N = Integer.parseInt(args[0]);

	double min = Double.parseDouble(args[1]);
	double max = Double.parseDouble(args[2]);

	int numIntersect = 0;
	int numContained = 0;
	Interval2D[] intervals = new Interval2D[N];
	for (int newBox = 0; newBox < N; newBox++)
	{
	    double xlo = StdRandom.uniform(min, max);
	    double xhi = StdRandom.uniform(min, max);
	    if (xlo > xhi)
	    {
		double swap = xlo;
		xlo = xhi;
		xhi = swap;
	    }
	    double ylo = StdRandom.uniform(min, max);
	    double yhi = StdRandom.uniform(min, max);
	    if (ylo > yhi)
	    {
		double swap = ylo;
		ylo = yhi;
		yhi = swap;
	    }

	    intervals[newBox] = get2D(xlo, xhi, ylo, yhi);
	    StdOut.println("Drawing newBox: " + intervals[newBox]);
	    intervals[newBox].draw();

	    for (int oldBox = newBox - 1; oldBox >= 0; oldBox--)
	    {
		if (isIntersecting(intervals[newBox], intervals[oldBox]))
		{
		    StdOut.println(newBox + " intersects " + oldBox);
		    numIntersect++;
		}

		if (isContained(intervals[newBox], intervals[oldBox]))
		{
		    numContained++;
		}
	    }
	}
    }

    private static boolean isContained(
	Interval2D newBox,
	Interval2D oldBox)
    {
	return false;
    }

    private static boolean isIntersecting(
	Interval2D newBox,
	Interval2D oldBox)
    {
	return newBox.intersects(oldBox);
    }

    private static Interval2D get2D(
	double xlo,
	double xhi,
	double ylo,
	double yhi)
    {
	Interval1D x = new Interval1D(xlo, xhi);
	Interval1D y = new Interval1D(ylo, yhi);

	Interval2D box = new Interval2D(x, y);

	return box;
    }

    private static Interval2D get2D(double min, double max)
    {
	return get2D(min, max, min, max);
    }
}
