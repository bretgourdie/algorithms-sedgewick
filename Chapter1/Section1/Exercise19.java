package Chapter1.Section1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19
{
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-2) + F(N-2);
    }

    public static long F(int N, long[] memo)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;

        if(N < memo.length && memo[N] >= 0)
        {
            return memo[N];
        }

        long result = F(N-2, memo) + F(N-2, memo);
        memo[N] = result;
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("One hour using F(N) yields F(75) = 137438953472");

        long[] memo = new long[100];
        for(int i = 0; i < memo.length; i++)
            memo[i] = -1;

        for (int N = 0; N < 100; N++)
            StdOut.println(N + " "  + F(N, memo));
    }
}
