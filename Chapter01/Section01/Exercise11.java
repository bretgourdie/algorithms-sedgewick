package Chapter01.Section01;

public class Exercise11
{
    public static void main(String[] args)
    {
        boolean[][] array = new boolean[230][15];
        
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++)
                array[i][j] = (j+i) % 2 == 0;

        print2dBoolArray(array);
    }

    public static void print2dBoolArray(boolean[][] array)
    {
        int max = getMax(array);
        String columnFormatText = getFormatText(max);
        String cellFormatText = columnFormatText;
        String rowFormatText = getFormatText(array.length+1);

        printColumnNumbers(max, columnFormatText);

        for(int i = 0; i < array.length; i++)
        {
            printRowHeader(i+1, rowFormatText);

            for(int j = 0; j < array[i].length; j++)
            {
                String toPrint = array[i][j] ? "*" : " ";
                System.out.printf(cellFormatText, toPrint);
            }

            System.out.println();
        }
    }

    public static void printColumnNumbers(int max, String formatText)
    {
        for(int i = -1; i < max; i++)
        {
            if(i >= 0)
            {
                System.out.printf(formatText, i+1);
            }
            else
            {
                // Skip the "row" column
                System.out.printf(formatText, " ");
            }
        }
        System.out.println();
    }

    public static void printRowHeader(int row, String formatText)
    {
        System.out.printf(formatText, row);
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
