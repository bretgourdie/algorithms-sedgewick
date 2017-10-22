package Chapter1.Section1;

public class Exercise02
{
    public static void main(String[] args)
    {
	System.out.println("Ex 1.1.2:");
	System.out.println(
	    "\ta) (1 + 2.236)/2 = "
	    + String.valueOf((1 + 2.236)/2)
	    + " (double)");

	System.out.println(
	    "\tb) 1 + 2 + 3 + 4.0 = "
	    + String.valueOf(1 + 2 + 3 + 4.0)
	    + " (double)");

	System.out.println(
	    "\tc) 4.1 >= 4 = "
	    + String.valueOf(4.1 >= 4)
	    + " (boolean)");

	System.out.println(
	    "\td) 1 + 2 + \"3\" = "
	    + String.valueOf(1 + 2 + "3")
	    + " (String)");
    }
}
