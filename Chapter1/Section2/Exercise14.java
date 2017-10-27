package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise14
{
    public static void main (String[] args)
    {
	testEqualTrans();
	testNotEqualTrans();
	testSameTrans();
	testDifferentClass();
    }

    public static void testDifferentClass()
    {
	StdOut.println("testDifferentClass()");
	Transaction t = new Transaction("Customer", 1, 1, 2017, 42);
	Counter c = new Counter("transaction?");

	if (!t.equals(c))
	    pGood();
    }

    public static void testSameTrans()
    {
	StdOut.println("testSameTrans()");
	Transaction one = new Transaction("Customer", 1, 1, 2017, 42);
	Transaction alsoOne = one;

	if (one.equals(alsoOne))
	    pGood();
    }

    public static void testNotEqualTrans()
    {
	StdOut.println("testNotEqualTrans()");
	Transaction one = new Transaction("Customer", 1, 1, 2017, 42);
	Transaction notOne = new Transaction("Buyer", 4, 5, 2016, 50);

	if (!one.equals(notOne))
	    pGood();
    }

    public static void pGood()
    {
	StdOut.println("\tGood!");
    }

    public static void testEqualTrans()
    {
	StdOut.println("testEqualTrans()");

	int month = 1, day = 1, year = 2017, amount = 42;
	String customer = "Some customer";
	Transaction one = new Transaction(new String(customer), month, day, year, amount);
	Transaction two = new Transaction(new String(customer), month, day, year, amount);

	if (one.equals(two))
	    pGood();
    }
}
