package Chapter01.Section01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise29
{
    public static void main(String[] args)
    {
        int[] whitelist = In.readInts(args[0]);
        boolean ignoreWhiteListInputs = 
            args.length == 1 || args[1].equals("+");

        Arrays.sort(whitelist);
        //whitelist = removeDups(whitelist); // to show count() working with dups

        while (!StdIn.isEmpty())
        {
            int key = StdIn.readInt();
            int count = count(key, whitelist);
            System.out.println(key + ": " + count);
        }
    }

    public static int[] removeDups(int[] whitelist)
    {
        int last = -1;
        int numUnique = 0;
        for (int cur : whitelist)
        {
            if(cur != last)
            {
                numUnique++;
            }

            last = cur;
        }

        last = -1;
        int currIndex = 0;
        int[] dedup = new int[numUnique];
        for (int cur : whitelist)
        {
            if(cur != last)
            {
                dedup[currIndex++] = cur;
            }

            last = cur;
        }

        return dedup;
    }

    public static int count(int key, int[] a)
    {
        int rank = rank(key, a, 0, a.length - 1, 0);

        int count = rank >= 0 ? 1 : 0;

        for (int i = rank+1; i < a.length && a[i] == key; i++)
            count++;

        for (int i = rank-1; i >= 0 && a[i] == key; i--)
            count++;

        return count;
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

        //System.out.println(indents + lo + " "  + hi);

        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else                   return mid;
    }
}
