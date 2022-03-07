package Assignment3;

import java.io.*;
import java.util.*;
public class Program01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		List<String> list = new ArrayList<>();
		int nonNumeric=0, numeric=0;
		while(true) {
			System.out.print("Do you want to Insert(y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'y') {
				System.out.print("Enter String : ");
				String str = br.readLine();
				int alphabet=0, number=0, flag=0;
				for(int i=0;i<str.length();i++) {
					char character = str.charAt(i);
					if(character == ' ') {
						flag = 1;
						break;
					}
					else if(Character.isLetter(character)) {
						alphabet++;
					}else if(Character.isDigit(character)) {
						number++;
					}
				}
				if(flag == 1) {
					System.out.println("String will be of Single Word");
					continue;
				}else if(alphabet == str.length()) {
					list.add(str);
					nonNumeric++;
				}else if(number == str.length()){
					list.add(str);
					numeric++;
				}else {
					System.out.println("String should contain either Alphabets or Digits");
					continue;
				}
				
			}else if(ch == 'n') {
				break;
			}else {
				System.out.println("Incorrect Choice : Choose Again");
				continue;
			}
		}
		System.out.println("Numeric Counter : "+numeric);
		System.out.println("NonNumeric Counter : "+nonNumeric);
	}

}
