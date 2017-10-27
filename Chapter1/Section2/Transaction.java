package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Transaction
{
    private final int month;
    private final int day;
    private final int year;
    private final int amount;

    public Transaction(int month, int day, int year, int amount)
    {
	this.month = month;
	this.day = day;
	this.year = year;
	this.amount = amount;
    }

    public int month() { return month; }
    public int day() { return day; }
    public int year() { return year; }
    public int amount() { return amount; }

    public String toString()
    {
	return month() + "/" + day() + "/" + year() + ": " + amount;
    }

    public boolean equals(Object x)
    {
	if (this == x) return true;
	if (x == null) return false;
	if (this.getClass() != x.getClass()) return false;

	Transaction that = (Transaction)x;

	return
	       that.month() == this.month()
	    && that.day() == this.day()
	    && that.year() == this.year()
	    && that.amount() == this.amount();
    }
}
