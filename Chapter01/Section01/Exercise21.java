package Chapter01.Section01;

import edu.princeton.cs.algs4.StdIn;
import java.util.ArrayList;

public class Exercise21
{
    public static void main(String[] args)
    {
        String[] lines = getStdInLines();
    }

    public static String[] getStdInLines()
    {
        ArrayList<String> lines = new ArrayList<String>();

        while(StdIn.hasNextLine())
        {
            String curLine = StdIn.readLine();
            lines.add(curLine);
        }

        return lines.toArray(new String[0]);
    }

    private class Record
    {
        public String name;
        public int possible;
        public int recorded;

        public Record(String name, int possible, int recorded)
        {
            this.name = name;
            this.possible = possible;
            this.recorded = recorded;
        }
    }
}
