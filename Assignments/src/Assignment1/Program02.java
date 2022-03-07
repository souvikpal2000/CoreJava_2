package Assignment1;
import java.util.*;
public class Program02 {
	static boolean checkAlpha(char alph) {
		char[] vowel = {'A','E','I','O','U','a','e','i','o','u'};
		int count = 0;
		int i=0;
		while(i<vowel.length) {
			if(alph == vowel[i]) {
				count = 1;
				break;
			}
			i++;
		}
		if(count==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.print("Enter Character : ");
		c = sc.next().charAt(0);
		boolean result = checkAlpha(c);
		if(result == true)
			System.out.println("Character is Vowel");
		else
			System.out.println("Character is not Vowel");
	}

}