package Assignment1;
import java.util.*;
public class Program06 {
	void printPrime(int maxVal) {
		int i=2;
		int flag;
		while(i<=maxVal) {
			flag = 0;
			for(int j=2;j<i/2;j++) {
				if(i%j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		Program06 ob = new Program06();
		ob.printPrime(range);
	}

}
