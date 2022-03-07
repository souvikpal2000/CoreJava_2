package Assignment1;
import java.util.Scanner;

public class Program04 {
	static double calTax(int gp) {
		double tax = 0;
		if(gp <= 240)
			tax = 0;
		else if(gp > 240 && gp <= 480)
			tax = 0.15 * gp;
		else if(gp > 480)
			tax = 0.28 * gp;
		return tax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gross Pay : ");
		int gross = sc.nextInt();
		double tax = calTax(gross);
		System.out.println("Tax : "+tax);
	}

}