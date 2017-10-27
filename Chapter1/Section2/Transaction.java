package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Transaction
{
    private final Date date;
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
	this.date = new Date(month, day, year);
	this.amount = amount;
    }

    public Transaction(String transaction)
    {
	String[] fields = transaction.split("\\s+");

	if (fields.length < 3)
	    throw new IllegalArgumentException(
		fields.length
		+ " fields detected (3 required)");

	String date = fields[fields.length - 2];
	String strAmount = fields[fields.length - 1];

	String customer = "";
	for (int ii = 0; ii < fields.length - 2; ii++)
	{
	    customer = customer + " " + fields[ii];
	}

	this.customer = new String(customer);
	this.date = new Date(date);
	this.amount = Double.parseDouble(strAmount);
    }

    public int month() { return date.month(); }
    public int day() { return date.day(); }
    public int year() { return date.year(); }
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
