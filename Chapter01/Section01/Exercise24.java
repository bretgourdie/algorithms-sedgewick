package Chapter01.Section01;

public class Exercise24
{
    public static void main(String[] args)
    {
        System.out.println("Sequence of values for 105 and 24:");
        gcd(105, 24);
    }

    public static int gcd(int p, int q)
    {
        System.out.println("\tp: " + p + "; q: " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
