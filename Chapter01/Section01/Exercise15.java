package Chapter01.Section01;

public class Exercise15
{
    public static void main(String[] args)
    {
	int M = 10;
	int[] orig = initialize(M);
	int[] histogram = histogram(orig, M);

	System.out.println("M: " + M);
	System.out.println("Orig:");
	printArray(orig);
	System.out.println("Histogram:");
	printArray(histogram);

	boolean confirmed = confirm(
	    orig,
	    histogram,
	    M);

	System.out.println("Valid? " + confirmed);
    }

    public static void printArray(int[] array)
    {
	for(int i = 0; i < array.length; i++)
	{
	    System.out.println((i + 1) + ": " + array[i]);
	}
    }
    
    public static int[] initialize(int M)
    {
	int[] array = new int[M];
	for(int i = 0; i < M; i++)
	{
	    array[i] = 5;
	}

	return array;
    }

    public static int[] histogram(int[] array, int M)
    {
	int[] histogram = new int[M];

	for(int i = 0; i < array.length; i++)
	{
	    if(i < histogram.length)
	    {
		int element = array[i];
		histogram[element] += 1;
	    }
	}

	return histogram;
    }

    public static boolean confirm(int[] array, int[] histogram, int M)
    {
	return false;
    }
}
