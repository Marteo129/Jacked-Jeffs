package militaryTime;

public class MilitaryTime {
	private int h1,h2,m1,m2;
	public MilitaryTime(String first, String second)
	{
		TimeInterval t1 = new TimeInterval(first);
		TimeInterval t2 = new TimeInterval(second);
		h1 = t1.getHours();
		m1 = t1.getMinutes();
		h2 = t2.getHours();
		m2 = t2.getMinutes();
	}

	public int calculateHourDifference()
	{
		return (23 - h1) + h2;
	}

	public int calculateMinuteDifference()
	{
		return (60 - m1) + m2;
	}

	public String getDifference()
	{
		if(h1 < h2)
		{
			// run if first time in smaller than second time
		}
		else if(h2 < h1)
		{
			// run if second time in smaller than first time
		}
		return Integer.toString(calculateHourDifference()) + " / " + Integer.toString(calculateMinuteDifference());
	}
}

/*Write a program that reads two times in military format (0900, 1730) and prints the number of hours and minutes between the two times. Here is a sample run. User input is in color.

Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
 */
