package Chapter1.Section2;

import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Exercise09
{
    public static int rank(int key, int[] a, Counter counter)
    {	// Array must be sorted.
	int lo = 0;
	int hi = a.length - 1;
	while (lo <= hi)
	{   // Key is in a[lo..hi] or not present.
	    counter.increment();
	    int mid = lo + (hi - lo) / 2;
	    if	    (key < a[mid]) hi = mid - 1;
	    else if (key > a[mid]) lo = mid + 1;
	    else		    return mid;
	}
	return -1;
    }

    public static void main(String[] args)
    {
	int[] whitelist = In.readInts(args[0]);

	Arrays.sort(whitelist);
	Counter counter = new Counter("keys");

	while (!StdIn.isEmpty())
	{   // Read key, print if not in whitelist.
	    int key = StdIn.readInt();
	    if (rank(key, whitelist, counter) < 0)
		StdOut.println(key);
	}

	StdOut.println(counter);
    }
}
