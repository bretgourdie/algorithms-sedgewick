package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19
{
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-2) + F(N-2);
    }

    public static void main(String[] args)
    {
        System.out.println("One hour using F(N) yields F(75) = 137438953472");

        for (int N = 0; N < 100; N++)
            StdOut.println(N + " "  + F(N));
    }
}
