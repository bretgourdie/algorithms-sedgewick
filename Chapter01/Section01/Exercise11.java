package Chapter01.Section01;

public class Exercise11
{
    public static void main(String[] args)
    {
        boolean[][] array = new boolean[10][10];
        
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = (j+i) % 2 == 0;

        print2dBoolArray(array);
    }

    public static void print2dBoolArray(boolean[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                String toPrint = array[i][j] ? "*" : " ";
                System.out.print(toPrint);
            }

            System.out.println();
        }
    }
}
