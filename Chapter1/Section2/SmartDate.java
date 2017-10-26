package Chapter1.Section2;

public class SmartDate extends edu.princeton.cs.algs4.Date
{
    private int[] daysInMonths = new int[]
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

    public SmartDate(int month, int day, int year)
    {
	super(month, day, year);

	if (month <= 0 || month >= daysInMonths.length)
	    throw new IllegalArgumentException(
		"Month "
		+ month
		+ " does not fall between 1 and "
		+ (daysInMonths.length - 1));

	int maxDays = numDaysInMonth(month, year);

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

    private int numDaysInMonth(int month, int year)
    {
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

	return maxDays;
    }

    public String dayOfTheWeek()
    {
	int year = year();
	int month = month();
	int day = day();

	if (year < 2001 || year > 2100)
	    throw new IllegalArgumentException(
		"Year "
		+ year
		+ " is not in the 21st century");

	SmartDate firstMonday = new SmartDate(1, 1, 2001);

	int numDaysBetweenYears = 0;
	for (int curYear = firstMonday.year();
	     curYear < year;
	     curYear++)
	{
	    for (int curMonth = 1; curMonth < 12; curMonth++)
	    {
		numDaysBetweenYears += numDaysInMonth(curMonth, curYear);
	    }
	}

	int numDaysBetweenMonths = 0;
	for (int curMonth = firstMonday.month();
	     curMonth < month;
	     curMonth++)
	{
	    numDaysBetweenMonths += numDaysInMonth(curMonth, year);
	}

	int numDaysBetweenDays = day - firstMonday.day();

	int totalDays = 
	    numDaysBetweenYears 
	    + numDaysBetweenMonths 
	    + numDaysBetweenDays;

	System.out.println("Debug:"
	    + "\n\tDaysBetweenYears: " + numDaysBetweenYears
	    + "\n\tDaysBetweenMonths: " + numDaysBetweenMonths
	    + "\n\tDaysBetweenDays: " + numDaysBetweenDays
	    + "\n\tTotal: " + totalDays);

	String[] days = new String[]
	{"Monday",
	"Tuesday",
	"Wednesday",
	"Thursday",
	"Friday",
	"Saturday",
	"Sunday"};

	return days[totalDays % days.length];
    }
}
