package Chapter1.Section2;

public class SmartDate extends edu.princeton.cs.algs4.Date
{
    public SmartDate(int month, int day, int year)
    {
	super(month, day, year);

	int[] daysInMonths = new int[]
	    {-1,
	    31,
	    28,
	    31,
	    30,
	    31,
	    30,
	    31,
	    31,
	    30,
	    31,
	    30,
	    31};

	if (month <= 0 || month >= daysInMonths.length)
	    throw new IllegalArgumentException(
		"Month "
		+ month
		+ " does not fall between 1 and "
		+ (daysInMonths.length - 1));

	int maxDays = daysInMonths[month];
	if (month == 2) // Calculate leap year stuff
	{
	    boolean isFourthYear = year % 4 == 0;
	    boolean isHundrethYear = year % 100 == 0;
	    boolean isFourHundrethYear = year % 400 == 0;

	    maxDays += isFourHundrethYear || (isFourthYear && !isHundrethYear)
		? 1
		: 0;
	}

	if (day <= 0 || day > maxDays)
	    throw new IllegalArgumentException(
		"Day "
		+ day
		+ " does not fall between 1 and "
		+ maxDays
		+ " for month "
		+ month
		+ " in year "
		+ year);
    }
}
