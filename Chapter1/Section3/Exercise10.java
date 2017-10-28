package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise10
{
    public static void main (String[] args)
    {
	String input = args[0];
	StdOut.println("Infix \"" + input + "\" to postfix: \""
	    + InfixToPostfix(input) + "\"");
    }

    public static String InfixToPostfix(String infix)
    {
	String[] split = infix.split("\\s");
	Stack<String> operators = new Stack<String>();
	Stack<String> operands =new Stack<String>();
	Stack<String> stack = new Stack<String>();
	String postFixExpression = "";

	for (String token : split)
	{
	    if (token.equals("+")
	     || token.equals("-")
	     || token.equals("/")
	     || token.equals("*"))
	    {
		while (!stack.isEmpty()
		    && !stack.peek().equals("("))
		{
		    postFixExpression += stack.pop() + " ";
		}

		stack.push(token);

	    }

	    else if (token.equals("("))
	    {
		stack.push(token);
	    }

	    else if (token.equals(")"))
	    {
		String popped;

		while (!stack.peek().equals("("))
		{
		    postFixExpression += stack.pop() + " ";
		}

		stack.pop();
	    }

	    else // operand
	    {
		postFixExpression += token + " ";
	    }
	}

	while (!stack.isEmpty())
	{
	    postFixExpression += stack.pop() + " ";
	}

	return postFixExpression;
    }
}
