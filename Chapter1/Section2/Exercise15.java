package Chapter1.Section2;

import edu.princeton.cs.algs4.*;
import java.io.*;

public class Exercise15
{
    public static void main (String[] args)
    {
	int[] ints = readInts(args[0]);

	StdOut.println(ints.length);
    }

    public static int[] readInts(String name)
    {
	In in = new In(name);

	String everything = in.readAll();

	String[] split = everything.split("\\s+");

	int[] ints = new int[split.length];

	for (int ii = 0; ii < split.length; ii++)
	{
	    ints[ii] = Integer.parseInt(split[ii]);
	}

	return ints;
    }
}
