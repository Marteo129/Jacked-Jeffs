package militaryTime;

import militaryTimeKevin.TimeInterval;

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
		int hourDiff = calculateHourDifference();
		int minDiff = calculateMinuteDifference();
		if(h2 > h1)
		{
			hourDiff = h2 - h1;
			minDiff = m2 - m1;
		}
		if(minDiff == 60)
		{
			minDiff = 0;
			hourDiff++;
		}
		else if(minDiff > 60)
		{
			hourDiff += Math.round(minDiff/60);
			minDiff %= 60;
		}
		return Integer.toString(hourDiff) + " / " + Integer.toString(minDiff);
	}
}

/*Write a program that reads two times in military format (0900, 1730) and prints the number of hours and minutes between the two times. Here is a sample run. User input is in color.

Please enter the first time: 0900
Please enter the second time: 1730
8 hours 30 minutes
 */
