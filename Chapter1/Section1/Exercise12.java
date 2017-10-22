package Chapter01.Section01;

public class Exercise12
{
    public static void main(String[] args)
    {
	System.out.println("This program prints 0-9.");

	int[] a = new int[10];
	for (int i = 0; i < 10; i++)
		a[i] = 9 - i;
	for (int i = 0; i < 10; i++)
	    a[i] = a[a[i]];
	for (int i = 0; i < 10; i++)
	    System.out.println(i);
    }
}
