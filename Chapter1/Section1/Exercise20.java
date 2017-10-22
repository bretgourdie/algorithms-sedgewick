package Chapter1.Section1;

public class Exercise20
{
    public static void main(String[] args)
    {
        if (args.length == 1)
        {
            long arg = Long.parseLong(args[0]);
            System.out.println(
                "ln(" + arg + "!) = "
                + lnFactorial(arg));
        }
    }

    public static double lnFactorial(long N)
    {
        return Math.log(factorial(N));
    }

    public static long factorial(long N)
    {
        if (N <= 1)
            return 1;

        return N * factorial(N-1);
    }
}
