package Chapter01.Section01;

public class Exercise22
{
    public static void main(String[] args)
    {
        
    }

    public static int rank(int key, int[] a)
    {   return rank(key, a, 0, a.length - 1);   }

    public static int rank(int key, int[] a, int lo, int hi)
    {   // Index of key in a[], if present, is not smaller than lo
        //                                  and not larger than hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else                   return mid;
    }
}
