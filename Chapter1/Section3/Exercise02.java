package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise02
{
    public static void main (String[] args)
    {
	String input = "it was - the best - of times - - - it  was - the - -";
	StdOut.println("Input: " + input);
	StdOut.println("Output: was best times of the was the it");
	printStack(input);
    }

    public static void printStack(String input)
    {
	StdOut.print("printStack(input): ");
	FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);

	String[] splitInput = input.split("\\s+");

	for(String word : splitInput)
	{
	    if (!word.equals("-"))
		s.push(word);
	    else if (!s.isEmpty())
		StdOut.print(s.pop() + " ");
	}

	StdOut.println();
    }
}
