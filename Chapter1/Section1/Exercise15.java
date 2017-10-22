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
	    array[i] = i;
	}

	return array;
    }

    public static int[] histogram(int[] array, int M)
    {
	int[] histogram = new int[M];

	for(int i = 0; i < array.length; i++)
	{
	    int element = array[i];
	    if(element < histogram.length)
	    {
		histogram[element] += 1;
	    }
	}

	return histogram;
    }

    public static boolean confirm(int[] array, int[] histogram, int M)
    {
	boolean correct;

	int sum = 0;
	for(int i = 0; i < histogram.length; i++)
	{
	    sum += histogram[i];
	}

	correct = sum == array.length;

	return correct;
    }
}
