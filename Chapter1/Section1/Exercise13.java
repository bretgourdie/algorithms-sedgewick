package Chapter01.Section01;

public class Exercise13
{
    public static void main(String[] args)
    {
	int m = 3;
	int n = 2;

	int[][] orig = initialize(m, n);

	int[][] transposed = transpose(orig, m, n);
	
	System.out.println("orig:");
	printArray(orig);
	System.out.println("transposed:");
	printArray(transposed);
    }

    public static void printArray(int[][] array)
    {
	for(int i = 0; i < array.length; i++)
	{
	    for(int j = 0; j < array[i].length; j++)
	    {
		System.out.print(array[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    public static int[][] initialize(int m, int n)
    {
	int[][] array = new int[m][n];
	int counter = 1;

	for(int i = 0; i < array.length; i++)
	    for(int j = 0; j < array[i].length; j++)
		array[i][j] = counter++;
	
	return array;
    }

    public static int[][] transpose(int[][] array, int m, int n)
    {
	int[][] transposed = new int[n][m];

	for(int i = 0; i < m; i++)
	    for(int j = 0; j < n; j++)
		transposed[j][i] = array[i][j];
	
	return transposed;
    }
}
