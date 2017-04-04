package Chapter01.Section01;

public class Exercise08
{
    public static void main(String[] args)
    {
        a();
        b();
        c();
    }

    public static void a()
    {
        System.out.println("a) ");

        System.out.println('b');
    }

    public static void b()
    {
        System.out.println("b) ");

        System.out.println('b' + 'c');
    }

    public static void c()
    {
        System.out.println("c) ");

        System.out.println((char) ('a' + 4));
    }
}
