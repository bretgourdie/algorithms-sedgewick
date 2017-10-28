package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise12
{
    public static void main (String[] args)
    {
	testEmptyStack();
	testFilledStack();
    }

    public static void testEmptyStack()
    {
	StdOut.println("testEmptyStack()");
	Stack<String> emptyStack = new Stack<String>();
	Stack<String> copy = copy(emptyStack);

	if (emptyStack.isEmpty())
	    StdOut.println("\tGood!");
    }

    public static void testFilledStack()
    {
	StdOut.println("testFilledStack()");
	String[] toFill = new String[] {"one", "two", "three"};
	Stack<String> filled = new Stack<String>();

	StdOut.println("Pushing: ");
	for (String string : toFill)
	{
	    StdOut.println("\t" + string);
	    filled.push(string);
	}

	Stack<String> copy = copy(filled);

	StdOut.println("Checking: ");
	while (!copy.isEmpty())
	    StdOut.println(copy.pop());
    }

    public static Stack<String> copy(Stack<String> toCopy)
    {
	Stack<String> backwards = new Stack<String>();
	while (!toCopy.isEmpty())
	    backwards.push(toCopy.pop());

	Stack<String> copy = new Stack<String>();
	while (!backwards.isEmpty())
	    copy.push(backwards.pop());

	return copy;
    }
}
