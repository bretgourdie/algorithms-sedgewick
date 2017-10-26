package Chapter1.Section2;

import edu.princeton.cs.algs4.StdOut;

public class Exercise06
{
    public static void main (String[] args)
    {
	StdOut.println(
	    args[0] 
	    + " and " 
	    + args[1] 
	    + " are circular: "
	    + areCircular(args[0], args[1]));
    }

    private static boolean areCircular(String s, String t)
    {
	return (s + s).indexOf(t) >= 0 && s.length() == t.length();
    }
}
