package Assignment1;

import java.util.Scanner;

public class Program07 {
	static float calculateProfit(int numAttendees) {
		float profit = (float) ((float)(5*numAttendees)-20-(0.50*numAttendees));
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Attendees : ");
		int n = sc.nextInt();
		float net = Program07.calculateProfit(n);
		System.out.println("The Show earns : "+net);
	}

}
