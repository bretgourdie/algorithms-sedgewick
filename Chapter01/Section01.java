public class Section01
{
    public static void main(String[] args)
    {
	Ex1x1x1();
	Ex1x1x2();
    }

    public static void Ex1x1x1()
    {
	System.out.println("Ex 1.1.1:");
	System.out.println(
	    "\ta) ( 0 + 15 ) / 2 = "
	    + String.valueOf(( 0 + 15 ) / 2));

	System.out.println(
	    "\tb) 2.0e-6 * 100000000.1 = "
	    + String.valueOf(2.0e-6 * 100000000.1));
	
	System.out.println(
	    "\tc) true && false || true && true = "
	    + String.valueOf(true && false || true && true));
    }

    public static void Ex1x1x2()
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
