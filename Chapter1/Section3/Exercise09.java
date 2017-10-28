package Chapter1.Section3;

import edu.princeton.cs.algs4.*;

public class Exercise09
{
    private static String[] listOfOperators;

    public static void main (String[] args)
    {
	initializeList();

	Stack<String> operands = new Stack<String>();
	Stack<String> operators = new Stack<String>();

	while (!StdIn.isEmpty())
	{
	    String cur = StdIn.readString();

	    if (isOperator(cur))
	    {
		operators.push(cur);
		StdOut.println("pushed " + cur);
	    }

	    else if (cur.equals(")"))
	    {
		String secondOperand = operands.pop();
		String firstOperand = operands.pop();
		String operator = operators.pop();

		StdOut.println("popped " 
			+ firstOperand 
			+ " " 
			+ operator
			+ " "
			+ secondOperand);
		
		String expression =
		    "( "
		    + firstOperand
		    + " "
		    + operator
		    + " "
		    + secondOperand
		    + " ) ";
		
		operands.push(expression);

		StdOut.println("expression: " + expression);
	    }

	    else // is operand
	    {
		operands.push(cur);
		StdOut.println("pushed " + cur);
	    }
	}

	StdOut.println(operands.pop());
    }

    public static boolean isOperator(String toTest)
    {
	for (String operator : listOfOperators)
	    if (operator.equals(toTest))
		return true;

	return false;
    }

    public static void initializeList()
    {
	listOfOperators = new String[4];
	listOfOperators[0] = "+";
	listOfOperators[1] = "-";
	listOfOperators[2] = "*";
	listOfOperators[3] = "/";
    }
}
