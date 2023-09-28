package militaryTime;

public class TimeInterval {
	String time = "";
	public TimeInterval(String time)
	{
		this.time = time;
	}

	public int getHours()
	{
		return Integer.parseInt(time.substring(0,2));
	}

	public int getMinutes()
	{
		return Integer.parseInt(time.substring(2,4));
	}

	//might be unnessasary
	public static int stringToInt(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
		return Integer.parseInt(str);
	}
}
