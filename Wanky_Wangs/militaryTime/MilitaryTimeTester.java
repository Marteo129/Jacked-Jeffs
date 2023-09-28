package militaryTime;

public class MilitaryTimeTester {
	public static void main(String[] args) {
		MilitaryTime mt = new MilitaryTime("1750","0430");  //7:50 to 4:30    10 hrs and 40 minutes
		System.out.println(mt.getDifference());

		MilitaryTime mt2 = new MilitaryTime("0430","1750");  // 4:30 to 7:50    3 hrs and 20 minutes
		System.out.println(mt2.getDifference());
	}
}
