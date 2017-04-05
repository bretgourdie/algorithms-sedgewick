package Chapter01.Section01;

public class Exercise22
{
    public static void main(String[] args)
    {
        int[] array = initialize(10000);
        int key = 4653;
        System.out.println("Rank of " + key + " is " + rank(key, array));
    }

    public static int[] initialize(int numValues)
    {
        int[] array = new int[numValues];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        return array;
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
