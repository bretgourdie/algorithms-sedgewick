package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise05
{
    public static void main (String[] args)
    {
	mystery(50);
    }

    // Prints the binary representation of N.
    // Pushes the lowest bit on the stack,
    // shifts the integer right,
    // then eventually prints out the bits in correct order.
    public static void mystery(int N)
    {
	Stack<Integer> stack = new Stack<Integer>();
	while (N > 0)
	{
	    stack.push(N % 2);
	    N = N / 2;
	}

	for (int d : stack) StdOut.print(d);
	StdOut.println();
    }
}
