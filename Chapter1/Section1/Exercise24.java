package Chapter1.Section1;

public class Exercise24
{
    public static void main(String[] args)
    {
        int[][] testValues = new int[2][];
        testValues[0] = new int[] {105, 24};
        int argQ = Integer.parseInt(args[0]);
        int argP = Integer.parseInt(args[1]);
        testValues[1] = new int[] {argQ, argP};

        for(int[] qAndP : testValues)
        {
            int q = qAndP[0];
            int p = qAndP[1];
            System.out.println("Sequence of values for " + q + " and " + p + ":");
            int gcd = gcd(q, p);
            System.out.println("gcd = " + gcd);
        }
    }

    public static int gcd(int p, int q)
    {
        System.out.println("\tp: " + p + "; q: " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
