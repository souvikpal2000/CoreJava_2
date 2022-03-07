package Assignment1;
import java.util.Scanner;

public class Program03 {
	static double calInterest(int amt) {
		double interest = 0;
		if(amt <= 1000)
			interest = 0.04 * amt;
		else if(amt <= 5000)
			interest = 0.045 * amt;
		else if(amt > 5000)
			interest = 0.05 * amt;
		return interest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int deposit;
		System.out.print("Enter Deposit Amount : ");
		deposit = sc.nextInt();
		double interest = calInterest(deposit);
		System.out.println("Interest : "+interest);
	}

}