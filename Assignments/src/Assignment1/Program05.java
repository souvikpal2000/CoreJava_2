package Assignment1;
import java.util.*;
public class Program05 {
	static boolean isPrimeNumber(int num) {
		boolean flag = false;
		for(int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
		    }
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int no = sc.nextInt();
		boolean b = Program05.isPrimeNumber(no);
		if(b == true) {
			System.out.println("Number is not Prime");
		}else {
			System.out.println("Number is Prime");
		}
	}

}