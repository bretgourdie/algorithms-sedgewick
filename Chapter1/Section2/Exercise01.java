package Chapter1.Section2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

public class Exercise01
{
    public static void main (String[] args)
    {
	int N = Integer.parseInt(args[0]);

	Point2D[] points = new Point2D[N];

	for (int ii = 0; ii < points.length; ii++)
	{
	    double x = Math.random();
	    double y = Math.random();

	    points[ii] = new Point2D(x, y);
	}

	double smallestDistance = Double.MAX_VALUE;
	for (int main = 0; main < points.length; main++)
	{
	    for (int to = 0; to < points.length; to++)
	    {
		if (main != to)
		{
		    double distance = points[main].distanceTo(points[to]);

		    smallestDistance = Math.min(smallestDistance, distance);
		}
	    }
	}

	StdOut.println("Smallest distance between "
	    + N
	    + " point(s) is " 
	    + smallestDistance);
    }
}
