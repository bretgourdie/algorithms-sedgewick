package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise07
{
    public static void main (String[] args)
    {
	testFirstNull();
	testFirstNotNull();
    }

    public static void testFirstNull()
    {
	StdOut.println("testFirstNull()");
	Chapter1.Section3.Stack<Integer> s = 
	    new Chapter1.Section3.Stack<Integer>();
	if( s.peek() == null)
	    StdOut.println("\tGood!");
    }

    public static void testFirstNotNull()
    {
	StdOut.println("testFirstNotNull()");
	Chapter1.Section3.Stack<Integer> s = 
	    new Chapter1.Section3.Stack<Integer>();
	s.push(1);
	s.push(2);
	if( s.peek() == 2)
	    StdOut.println("\tGood!");
    }
}
