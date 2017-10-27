package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Exercise17
{
    public static void main (String[] args)
    {
	// testPlusAssertions(); // will throw assertion
	// testMinusAssertions(); // will throw assertion
	// testTimesAssertions(); // will throw assertion
	// testDividesAssertions(); // will throw assertion
    }

    private static Rational[] getOvRats()
    {
	Rational[] rationals = new Rational[2];
	rationals[0] = new Rational(1, Integer.MAX_VALUE);
	rationals[1] = new Rational(1, 2);

	return rationals;
    }

    public static void testPlusAssertions()
    {
	Rational[] nums = getOvRats();
	Rational r = nums[0].plus(nums[1]);
    }

    public static void testMinusAssertions()
    {
	Rational[] nums = getOvRats();
	Rational r = nums[0].minus(nums[1]);
    }

    public static void testTimesAssertions()
    {
	Rational[] nums = getOvRats();
	Rational r = nums[0].times(nums[1]);
    }

    public static void testDividesAssertions()
    {
	Rational[] nums = getOvRats();
	Rational r = nums[0].divides(nums[1]);
    }
}
