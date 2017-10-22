package Chapter01.Section01;

import edu.princeton.cs.algs4.StdOut;

public class Exercise07
{
    public static void main(String[] args)
    {
        a();
        b();
        c();
    }

    public static void a()
    {
        System.out.print("a) ");

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }

    public static void b()
    {
        System.out.print("b) ");

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

    public static void c()
    {
        System.out.print("c) ");

        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++) // Corrected from "j < N"
                sum++;
        StdOut.println(sum);
    }
}
