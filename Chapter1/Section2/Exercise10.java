package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise10
{
    public static void main (String[] args)
    {
	testSimpleInc();
	testSimpleDec();
	testOverIncValue();
	testOverDecValue();
	testOverIncOps();
	testOverDecOps();
	testPlot();
    }

    public static void cInc(VisualCounter c, int numIncs)
    {
	for (int ii = 0; ii < numIncs; ii++)
	    c.increment();
    }

    public static void cDec(VisualCounter c, int numDecs)
    {
	for (int ii = 0; ii < numDecs; ii++)
	    c.decrement();
    }

    public static void cPrint(
	VisualCounter c, 
	int numOps, 
	String op)
    {
	StdOut.println(
	    "\tNum "
	    + op
	    + "s: "
	    + numOps
	    + "; "
	    + c);
    }

    public static void testSimpleInc()
    {
	StdOut.println("testSimpleInc()");
	int numIncs = 10;
	VisualCounter c = new VisualCounter(numIncs, Integer.MAX_VALUE);

	cInc(c, numIncs);

	cPrint(c, numIncs, "inc");
    }

    public static void testSimpleDec()
    {
	StdOut.println("testSimpleDec()");
	int numDecs = 10;
	VisualCounter c = new VisualCounter(numDecs, Integer.MAX_VALUE);

	cDec(c, numDecs);

	cPrint(c, numDecs, "dec");
    }

    public static void testOverIncValue()
    {
	StdOut.println("testOverIncValue()");
	int numIncs = 10;
	VisualCounter c = new VisualCounter(numIncs, numIncs / 2);

	cInc(c, numIncs);

	cPrint(c, numIncs, "inc");
    }

    public static void testOverDecValue()
    {
	StdOut.println("testOverDecValue()");
	int numDecs = 10;
	VisualCounter c = new VisualCounter(numDecs, numDecs / 2);

	cDec(c, numDecs);

	cPrint(c, numDecs, "dec");
    }

    public static void testOverIncOps()
    {
	StdOut.println("testOverIncOps()");
	int numIncs = 10;
	VisualCounter c = new VisualCounter(numIncs / 2, numIncs);

	cInc(c, numIncs);

	cPrint(c, numIncs, "inc");
    }

    public static void testOverDecOps()
    {
	StdOut.println("testOverDecOps()");
	int numDecs = 10;
	VisualCounter c = new VisualCounter(numDecs / 2, numDecs);

	cDec(c, numDecs);

	cPrint(c, numDecs, "dec");
    }

    public static void testPlot()
    {
	StdOut.println("testPlot()");
	int numOps = 20;
	VisualCounter c = new VisualCounter(numOps, numOps/2);

	cInc(c, numOps / 2);
	cDec(c, numOps / 2);

	cPrint(c, numOps, "incs and dec");

	c.plot();
    }

}
