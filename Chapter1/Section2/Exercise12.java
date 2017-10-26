package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise12
{
    public static void main (String[] args)
    {
	testSameDay();
	testNextDay();
	testNextMonth();
	testNextYear();
	testSomeOtherDay();
    }

    public static void dow(int month, int day, int year)
    {
	SmartDate d = new SmartDate(month, day, year);
	StdOut.println("\t" + d.dayOfTheWeek());
    }

    public static void testSameDay()
    {
	StdOut.println("testSameDay()");
	dow(1, 1, 2001);
    }

    public static void testNextDay()
    {
	StdOut.println("testNextDay()");
	dow(1, 2, 2001);
    }

    public static void testNextMonth()
    {
	StdOut.println("testNextMonth()");
	dow(2, 1, 2001);
    }

    public static void testNextYear()
    {
	StdOut.println("testNextYear()");
	dow(1, 1, 2002);
    }

    public static void testNextDayMonthYear()
    {
	StdOut.println("testNextDayMonthYear()");
	dow(2, 2, 2002);
    }

    public static void testSomeOtherDay()
    {
	StdOut.println("testSomeOtherDay()");
	dow(10, 26, 2017);
    }
}
