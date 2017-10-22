package Chapter01.Section01;

public class Exercise09
{
    public static void main(String[] args)
    {
        if (args.length == 1)
        {
            String rawN = args[0];
            int n = Integer.parseInt(rawN);

            if (n > 0)
            {
                String result = getBinaryRepresentation(n);
                System.out.println(result);
            }
            else
            {
                System.out.println("N must be positive; was " + String.valueOf(n));
            }
        }
        else
        {
            System.out.println("Must have one integer argument.");
        }
    }

    public static String getBinaryRepresentation(int n)
    {
        String binN = "";

        while (n > 0)
        {
            int mod = n % 2;
            binN = mod + binN;
            n /= 2;
        }

        return binN;
    }
}
