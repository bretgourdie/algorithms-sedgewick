package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise16
{
    public static void main (String[] args)
    {
	testPlus();
	testMinus();
	testTimes();
	testDivides();
	testEquals();
	testNotEquals();
    }

    public static void pOp(
	Rational a, 
	String operand, 
	Rational b,
	Rational result)
    {
	StdOut.println(
	    "\t"
	    + a
	    + " "
	    + operand
	    + " "
	    + b
	    + " = "
	    + result);
    }

    public static void testPlus()
    {
	StdOut.println("testPlus()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(3, 4);
	Rational r = a.plus(b);
	pOp(a, "+", b, r);
    }

    public static void testMinus()
    {
	StdOut.println("testMinus()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(1, 6);
	Rational r = a.minus(b);
	pOp(a, "-", b, r);
    }

    public static void testTimes()
    {
	StdOut.println("testTimes()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(3, 4);
	Rational r = a.times(b);
	pOp(a, "x", b, r);
    }

    public static void testDivides()
    {
	StdOut.println("testDivides()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(1, 4);
	Rational r = a.divides(b);
	pOp(a, "/", b, r);

    }

    public static void testEquals()
    {
	StdOut.println("testEquals()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(24, 48);
	if (a.equals(b))
	    StdOut.println("\tGood!");
    }

    public static void testNotEquals()
    {
	StdOut.println("testNotEquals()");
	Rational a = new Rational(1, 2);
	Rational b = new Rational(1, 4);
	if (!a.equals(b))
	    StdOut.println("\tGood!");
    }
}
