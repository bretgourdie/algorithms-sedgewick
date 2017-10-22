package Chapter1.Section1;

public class Exercise18
{
    public static void main(String[] args)
    {
        int[][] tests = {{2, 25}, {3, 11}};

        for(int i = 0; i < tests.length; i++)
        {
            int[] curSet = tests[i];
            int a = curSet[0];
            int b = curSet[1];
            int result = mystery(a, b);
            System.out.println("mystery("
                + a
                + ", "
                + b
                + ") = "
                + result);
        }
        System.out.println("mystery(a, b) multiplies a and b.");

        for(int i = 0; i < tests.length; i++)
        {
            int[] curSet = tests[i];
            int a = curSet[0];
            int b = curSet[1];
            int result = mysteryMult(a, b);
            System.out.println("mysteryMult("
                + a
                + ", "
                + b
                + ") = "
                + result);
        }
        System.out.println("mysteryMult(a, b) raises a to the bth power.");
    }

    public static int mystery(int a, int b)
    {
        if (b == 0)     return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static int mysteryMult(int a, int b)
    {
        if (b == 0)     return 1;
        if (b % 2 == 0) return mysteryMult(a*a, b/2);
        return mysteryMult(a*a, b/2) * a;
    }
}
