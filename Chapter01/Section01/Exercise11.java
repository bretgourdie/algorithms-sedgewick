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
        int max = getMax(array);
        String formatText = getFormatText(max);

        printColumnNumbers(max, formatText);

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                String toPrint = array[i][j] ? "*" : " ";
                System.out.printf(formatText, toPrint);
            }

            System.out.println();
        }
    }

    public static void printColumnNumbers(int max, String formatText)
    {
        for(int i = 0; i < max; i++)
        {
            System.out.printf(formatText, i+1);
        }
        System.out.println();
    }

    public static int getMax(boolean[][] array)
    {
        int max = 0;

        for(int i = 0; i < array.length; i++)
        {
            max = Math.max(max, array[i].length);
        }

        return max;
    }

    public static String getFormatText(int max)
    {
        int numDigits = String.valueOf(max).length();
        String formatText = "%1$" + numDigits + "s ";
        return formatText;
    }
}
