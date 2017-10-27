package Chapter1.Section3;

public class Exercise01
{
    public static void main (String[] args)
    {
	FixedCapacityStackOfStrings fcss = new FixedCapacityStackOfStrings(2);
	System.out.println("new fcss(2); isFull(): " + fcss.isFull());
	fcss.push("One");
	System.out.println("fcss.push(\"One\"); isFull(): " + fcss.isFull());
	fcss.push("Two");
	System.out.println("fcss.push(\"Two\"); isFull(): " + fcss.isFull());
    }
}
