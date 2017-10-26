package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise07
{
    public static void main (String[] args)
    {
	StdOut.println(mystery("Jeremy Gor-Don Fun Time"));
    }

    // Returns reversed string
    public static String mystery(String s)
    {
	int N = s.length();
	if (N <= 1) return s;
	String a = s.substring(0, N/2);
	String b = s.substring(N/2, N);
	return mystery(b) + mystery(a);
    }
}
