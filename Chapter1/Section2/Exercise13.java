package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise13
{
    public static void main (String[] args)
    {
	Transaction deposit = new Transaction("The Techs", 10, 26, 2017, 150);
	Transaction withdrawal = new Transaction("SDI Butler", 10, 26, 2017, -70);

	StdOut.println(deposit + "\n" + withdrawal);
    }
}
