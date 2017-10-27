package Chapter1.Section2;

import edu.princeton.cs.algs4.*;

public class Rational
{
    private final int numerator, denominator;

    public Rational(int numerator, int denominator)
    {
	this.numerator = numerator / gcd(numerator, denominator);
	this.denominator = denominator / gcd(numerator, denominator);
    }

    public int numerator() { return numerator; }
    public int denominator() { return denominator; }

    public Rational plus (Rational b)
    {
	return sum(b, 1);
    }

    public Rational minus (Rational b)
    {
	return sum(b, -1);
    }

    private Rational sum(Rational b, int multiplyBit)
    {
	int newA = numerator * b.denominator();
	int newB = b.numerator * denominator();
	
	int newNum = newA + newB * multiplyBit;
	int newDom = denominator * b.denominator();

	return new Rational(newNum, newDom);
    }

    public Rational times (Rational b)
    {
	return new Rational(
	    numerator * b.numerator(), 
	    denominator * b.denominator());
    }

    public Rational divides (Rational b)
    {
	return new Rational(
	    numerator * b.denominator(),
	    denominator * b.numerator());
    }

    public boolean equals (Rational that)
    {
	if (this == that) return true;
	if (that == null) return false;
	return
	    this.numerator() == that.numerator()
	    && this.denominator() == that.denominator();
    }

    public String toString()
    {
	return numerator + "/" + denominator;
    }

    private static int gcd (int p, int q)
    {
	if (q == 0) return p;
	int r = p % q;
	return gcd(q, r);
    }
}
