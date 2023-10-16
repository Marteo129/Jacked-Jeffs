package p4_14;

public class TimeInterval {
	private String first, second;
	private int minuteDifference, hourDifference;

	/**
	 * 
	 * @param first first military time
	 * @param second second military time
	 */
	TimeInterval(String first, String second){
		this.first = first;
		this.second = second;

	}
	/**
	 * 
	 * @param time time passed in
	 * @return hours of time passed in
	 */
	public int getHours(String time){
		return stringToNumber(time.substring(0, 2));
	}

	/**
	 * 
	 * @param time time passed in
	 * @return minutes of time passed in
	 */
	public int getMinutes(String time){
		return stringToNumber(time.substring(2, 4));
	}

	/**
	 * calculates the time difference in hours and minutes for the two military times passed in
	 */
	public void calculateTimeDifference()
	{
		hourDifference = getHours(second) - getHours(first);

		minuteDifference = getMinutes(second) - getMinutes(first);

		if(getMinutes(first) > getMinutes(second))
		{
			hourDifference--;
			minuteDifference += 60;
		}

		if(hourDifference < 0)
			hourDifference += 24;

		if(minuteDifference < 0)
			minuteDifference += 60;

		if(minuteDifference > 60)
			minuteDifference %= 60;
	}

	/**
	 * 
	 * @return returns the minuteDifference of the two times
	 */
	public int getMinuteDifference()
	{
		return minuteDifference;
	}

	/**
	 * 
	 * @return returns the hourDifference of the two times
	 */
	public int getHourDifference()
	{
		return hourDifference;
	}

	/**
	 * 
	 * @param input inputs a string
	 * @return returns an integer of a previous string value if possible (ex. "1" - 1)
	 */
	private int stringToNumber(String input)
	{
		try
		{
			return (int) Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}

}
