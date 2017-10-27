package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Parenthesis
{
    private final Stack<Character> stack;

    public Parenthesis() 
    {
	stack = new Stack<Character>();
    }

    public boolean isBalanced()
    {
	while(!StdIn.isEmpty())
	{
	    char token = StdIn.readChar();

	    if (token == '['
	     || token == '('
	     || token == '{')
		stack.push(token);
	    else
		if ((leftParen == '[' && token != ']')
		 || (leftParen == '(' && token != ')')
		 || (leftParen == '{' && token != '}'))
		    return false;
	}

	return stack.isEmpty();
    }

}
