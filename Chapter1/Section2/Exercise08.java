package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise08
{
    public static void main (String[] args)
    {
	StdOut.println("Code: int[] t = a; a = b; b = t;");
	StdOut.println("Code swaps pointers. "
	    + "There is no array copying, just three addresses, "
	    + "so it is incredibly efficient.");
    }
}
