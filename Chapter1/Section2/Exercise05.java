package Chapter1.Section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise05
{
    public static void main (String[] args)
    {
	String s = "Hello World";
	s.toUpperCase();
	s.substring(6, 11);
	StdOut.println(s); // Prints "Hello World" because it is immutable
    }
}
