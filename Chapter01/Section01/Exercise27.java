package Chapter01.Section01;

public class Exercise27
{
    public static void main(String[] args)
    {
        int N = 100;
        int k = 50;
        double p = 0.25;
        double result = binomial(N, k, p);
        System.out.println(
            "binomial(" 
            + N 
            + ", " 
            + k 
            + ", " 
            + p 
            + ") = "
            + result);
    }

    public static double binomial(int N, int k, double p)
    {
        double[][] results = new double[N+1][k+1];
        for (int i = 0; i < results.length; i++)
            for (int j = 0; j < results[i].length; j++)
                results[i][j] = -1;
        return binomial(N, k, p, results);
    }

    public static double binomial(int N, int k, double p, double[][] results)
    {
        System.out.println("N: " + N + "; k: " + k);
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;

        if (results[N][k] >= 0)
            return results[N][k];

        double result = (1.0 - p)*binomial(N-1, k, p, results) + p*binomial(N-1, k-1, p, results);
        results[N][k] = result;
        return result;
    }
}
