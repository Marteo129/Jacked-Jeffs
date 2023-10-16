package p4_14;

import java.util.Scanner;

/**
 * UI of TimeInterval
 */
public class MilitaryTimeUI {
	private TimeInterval mt;
	private Scanner fromKeyboard;
	private String first, second;
	
	/**
	 * imports scanner and creates object of TimeInterval
	 */
	public MilitaryTimeUI() {
		this.fromKeyboard = new Scanner(System.in);
		
		System.out.println("Enter the first miliary time:");
		first = fromKeyboard.nextLine();
		
		
		System.out.println("\nEnter the second miliary time:");
		second = fromKeyboard.nextLine();
		
		this.mt = new TimeInterval(first, second); 
		
		System.out.println("The First Time Entered Was: " + mt.getHours(first) + " hours and " + mt.getMinutes(first) + " minutes\n" +
		"The Second Time Entered Was: " + mt.getHours(second) + " hours and " + mt.getMinutes(second) + " minutes\n");
		
		mt.calculateTimeDifference();
		
		System.out.println("The Time Differene between the first and second time is " + mt.getHourDifference() + " hours and \n" +
		mt.getMinuteDifference() + " minutes");
		
	}
}
