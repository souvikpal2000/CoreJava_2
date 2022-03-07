package Assignment3;

import java.io.*;
public class Program08 {
	public static boolean checkPalindrome(String str) {
		int l = str.length();
		boolean flag=true;
		for(int i=0;i<l/2;i++) {
			char start = str.charAt(i);
			char end = str.charAt(l-1-i);
			if(start != end) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter String : ");
		String str = br.readLine();
		boolean flag = checkPalindrome(str);
		if(flag) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}
	}

}
