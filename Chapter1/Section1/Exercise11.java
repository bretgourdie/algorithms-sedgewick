package Chapter1.Section1;

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
        int colMax = getColumnMax(array);
        int rowMax = array.length+1;

        String columnFormatText = getFormatText(colMax);
        String cellFormatText = columnFormatText;
        String rowFormatText = getFormatText(rowMax);

        printColumnNumbers(colMax, rowMax, columnFormatText, rowFormatText);

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

    public static void printColumnNumbers(
        int max, 
        int rowMax, 
        String columnFormatText, 
        String rowFormatText)
    {
        // To skip the "row" column
        printRowHeader(" ", rowFormatText);

        for(int i = 0; i < max; i++)
        {
            System.out.printf(columnFormatText, i+1);
        }
        System.out.println();
    }

    public static void printRowHeader(int row, String formatText)
    {
        printRowHeader(String.valueOf(row), formatText);
    }

    public static void printRowHeader(String row, String formatText)
    {
        System.out.printf(formatText, row);
    }

    public static int getColumnMax(boolean[][] array)
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
