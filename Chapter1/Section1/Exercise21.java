package Chapter1.Section1;

import edu.princeton.cs.algs4.StdIn;
import java.util.ArrayList;

public class Exercise21
{
    public static void main(String[] args)
    {
        String[] lines = StdIn.readAllLines();
        printLines(lines);
    }

    public static void printLines(String[] lines)
    {
        for(String line : lines)
        {
            String[] split = line.split(" ");
            if (split.length == 3)
            {
                String name = split[0];
                int recorded = Integer.parseInt(split[1]);
                int possible = Integer.parseInt(split[2]);
                double percentage = (double)recorded / possible;

                System.out.printf("%10s %4d %4d %10.3f%n",
                    name,
                    recorded,
                    possible,
                    percentage);
            }
        }
    }
}
