package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise19
{
    public static void main (String[] args)
    {
	testEasyCase();
	testCustomerWithSpaces();
	testBadDate();
	testBadAmount();
    }

    public static void testEasyCase()
    {
	StdOut.println(
	    new Transaction("Turing 5/22/1939 11.99"));
    }

    public static void testCustomerWithSpaces()
    {
	StdOut.println(
	    new Transaction("SDI Butler 5/22/1939 11.99"));
    }

    public static void testBadDate()
    {
	try
	{
	    StdOut.println(
		new Transaction("SDI asdf/123/4 11.99"));
	}
	catch (NumberFormatException ex)
	{
	    StdOut.println("testBadDate() good!");
	}
    }

    public static void testBadAmount()
    {
	try
	{
	    StdOut.println(
		new Transaction("SDI 5/22/1939 asdf"));
	}
	catch (NumberFormatException ex)
	{
	    StdOut.println("testBadAmount() good!");
	}
    }
}
