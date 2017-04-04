package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise06
{
    public static void main(String[] args)
    {
        System.out.println(
            "Prints the first 16 digits of the Fibonacci sequence:\n"
            + "\t 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610");
	int f = 0;
	int g = 1;
	for (int i = 0; i <= 15; i++)
	{
	    StdOut.println(f);
	    f = f + g;
	    g = f - g;
	}
    }
}
