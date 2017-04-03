public class Exercise05
{
    public static void main(String[] args)
    {
	double x, y;

	/* ... */

	boolean xBetween, yBetween;

	xBetween = x > 0.0 && x < 1.0;
	yBetween = y > 0.0 && y < 1.0;

	System.out.println(xBetween && yBetween);
    }
}
