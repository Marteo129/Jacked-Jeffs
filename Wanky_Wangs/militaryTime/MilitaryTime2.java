package militaryTime;

import java.util.Scanner;

public class MilitaryTime2 {
	
	public static void main(String[] args) {
		Scanner fromKeyboard = new Scanner(System.in);
		
		System.out.print("Enter your first time: ");
		String t1 = fromKeyboard.nextLine();
		
		System.out.print("Enter your second time: ");
		String t2 = fromKeyboard.nextLine();
		
		int h1 = Integer.parseInt(t1.substring(0, 2)), m1 = Integer.parseInt(t1.substring(2, 4));
		int h2 = Integer.parseInt(t2.substring(0, 2)), m2 = Integer.parseInt(t2.substring(2, 4));
		
		final int MINUTES_IN_HOUR = 60;
		final int MINUTES_IN_DAY = 60 * 24;
		
		int diff = ((h2 - h1) * MINUTES_IN_HOUR + (m2 - m1) + MINUTES_IN_DAY) % MINUTES_IN_DAY;
		int h = diff / MINUTES_IN_HOUR, m = diff % MINUTES_IN_HOUR;
		
		// debug
//		System.out.println(String.format("t1: %d hours and %d minutes", h1, m1));
//		System.out.println(String.format("t2: %d hours and %d minutes", h2, m2));
//		System.out.println(String.format("diff: %d", diff));
		
		System.out.println(String.format("\nThe difference is: %d hours and %d minutes", h, m));
		
		fromKeyboard.close();
	}
}
