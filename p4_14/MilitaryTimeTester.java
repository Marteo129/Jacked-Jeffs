package p4_14;

public class MilitaryTimeTester {
	public static void main(String[] args) {
		TimeInterval mt = new TimeInterval("1750","0430");//7:50 to 4:30    10 hrs and 40 minutes
		mt.calculateTimeDifference();
		System.out.println(mt.getHourDifference());
		System.out.println(mt.getMinuteDifference());

		TimeInterval mt2 = new TimeInterval("0430","1750");  // 4:30 to 7:50    13 hrs and 20 minutes
		mt2.calculateTimeDifference();
		System.out.println(mt2.getHourDifference());
		System.out.println(mt2.getMinuteDifference());
		
		MilitaryTimeUI mtui = new MilitaryTimeUI();
	}
}
