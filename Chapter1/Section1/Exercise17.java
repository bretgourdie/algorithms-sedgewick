package Chapter01.Section01;

public class Exercise17
{
    public static void main(String[] args)
    {
        System.out.println("The base case will never be reached.");
    }

    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if(n <= 0) return "";
        return s;
    }
}
