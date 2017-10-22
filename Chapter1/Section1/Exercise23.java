package Chapter01.Section01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise23
{
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        boolean ignoreWhiteListInputs = 
            args.length == 1 || args[1].equals("+");

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            int rank = rank(key, whitelist);
            if (rank < 0 && ignoreWhiteListInputs)
            {
                StdOut.println(key);
            }
            else if (rank >= 0 && !ignoreWhiteListInputs)
            {
                StdOut.println(key);
            }
        }
    }

    public static int rank(int key, int[] a)
    {   return rank(key, a, 0, a.length - 1, 0);   }

    public static int rank(int key, int[] a, int lo, int hi, int depth)
    {   // Index of key in a[], if present, is not smaller than lo
        //                                  and not larger than hi
        String indents = "";
        for(int i = 0; i < depth; i++)
        {
            indents = indents + "  ";
        }

        System.out.println(indents + lo + " "  + hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else                   return mid;
    }
}
