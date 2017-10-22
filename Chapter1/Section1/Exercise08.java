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
        System.out.println("a) Prints the letter 'b':");

        System.out.println('b');
    }

    public static void b()
    {
        System.out.println("b) Prints the result of the ASCII values of 'b' and 'c' summed together:");

        System.out.println('b' + 'c');
    }

    public static void c()
    {
        System.out.println("c) Prints the ASCII character four after 'a':");

        System.out.println((char) ('a' + 4));
    }
}
