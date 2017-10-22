package Chapter1.Section1;

public class Exercise26
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int t;

        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }

        System.out.println("a: " + a + "; b: " + b + "; c: " + c);
        System.out.println("The program sorts such that a comes before b, then a comes before c. "
            + "Finally, b is put before c. "
            + "Due to the transitive property, all are sorted at this point.");
    }
}
