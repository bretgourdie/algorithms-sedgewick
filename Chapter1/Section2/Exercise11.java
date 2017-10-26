package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise11
{
    private static int[] daysInMonths = new int[]
	{-1,
	31,
	28,
	31,
	30,
	31,
	30,
	31,
	31,
	30,
	31,
	30,
	31};

    public static void main (String[] args)
    {
	testGoodDatesNonLeapYear();

	testZeroMonth();
	testOutMonth();
	testZeroDay();
	testOutDay();

	testGoodLeapYear();
	testHundrethLeapYear();
	testFourHundrethLeapYear();
    }

    public static void testGoodDatesNonLeapYear()
    {
	StdOut.println("testGoodDatesNonLeapYear()");

	int year = 2017;
	for (int month = 1; month < daysInMonths.length; month++)
	{
	    for (int day = 1; day <= daysInMonths[month]; day++)
	    {
		SmartDate date = new SmartDate(month, day, year);
	    }
	}

	pGood();
    }

    public static void pGood()
    {
	StdOut.println("\tGood!");
    }

    public static void testZeroMonth()
    {
	StdOut.println("testZeroMonth()");
	try
	{
	    SmartDate date = new SmartDate(0, 1, 2017);
	    throw new RuntimeException();
	}
	catch (IllegalArgumentException ex)
	{
	    pGood();
	}
    }

    public static void testOutMonth()
    {
	StdOut.println("testOutMonth()");
	try
	{
	    SmartDate date = new SmartDate(daysInMonths.length, 1, 2017);
	    throw new RuntimeException();
	}
	catch (IllegalArgumentException ex)
	{
	    pGood();
	}
    }

    public static void testZeroDay()
    {
	StdOut.println("testZeroDay()");
	
	for (int month = 1; month < daysInMonths.length; month++)
	{
	    try
	    {
		SmartDate date = new SmartDate(month, 0, 2017);
		throw new RuntimeException();
	    }
	    catch (IllegalArgumentException ex) { }
	}

	pGood();
    }

    public static void testOutDay()
    {
	StdOut.println("testOutDay()");

	for (int month = 1; month < daysInMonths.length; month++)
	{
	    try
	    {
		SmartDate date = new SmartDate(month, daysInMonths[month] + 1, 2017);
		throw new RuntimeException();
	    }
	    catch (IllegalArgumentException ex) { }
	}

	pGood();
    }

    public static void testGoodLeapYear()
    {
	StdOut.println("testGoodLeapYear()");

	SmartDate date = new SmartDate(2, 29, 2012);

	pGood();
    }

    public static void testHundrethLeapYear()
    {
	StdOut.println("testHundrethLeapYear()");

	try
	{
	    SmartDate date = new SmartDate(2, 29, 2100);
	    throw new RuntimeException();
	}
	catch (IllegalArgumentException ex) { }


	pGood();
    }

    public static void testFourHundrethLeapYear()
    {
	StdOut.println("testFourHundrethLeapYear()");

	SmartDate date = new SmartDate(2, 29, 2400);

	pGood();
    }
}
