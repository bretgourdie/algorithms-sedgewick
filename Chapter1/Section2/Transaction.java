package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Transaction
{
    private final int month;
    private final int day;
    private final int year;
    private final String customer;
    private final double amount;

    public Transaction(
	String customer, 
	int month, 
	int day, 
	int year, 
	double amount)
    {
	this.customer = new String(customer);
	this.month = month;
	this.day = day;
	this.year = year;
	this.amount = amount;
    }

    public int month() { return month; }
    public int day() { return day; }
    public int year() { return year; }
    public double amount() { return amount; }
    public String customer() { return new String(customer); }

    public String toString()
    {
	return customer 
	    + " " 
	    + month() + "/" + day() + "/" + year() 
	    + " " 
	    + amount;
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
	    && that.amount() == this.amount()
	    && that.customer().equals(this.customer());
    }
}
