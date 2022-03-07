package Assignment3;

import java.io.*;
import java.util.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class Program03 {
	public static int countNoOfSpace(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				count = count + 1;
			}
		}
		return count;
	}
	public static Map<Character, Integer> countCharacter(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=65;i<=122;i++) {
			int count = 0;
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				if((char)i == ch) {
					count++;
				}
			}
			if(count>0) {
				map.put((char)i, count);
			}
		}
		return map;
	}
	public static int factorial(int no) {
		int f=1;
		for(int i=1;i<=no;i++) {
			f = f * i;
		}
		return f;
	}
	public static List<Character> removeDuplicates(List<Character> list){
		List<Character> l = new ArrayList<>();
		for(int i=65;i<=122;i++) {
			char ch = (char)i;
			int count=0;
			for(Character c : list) {
				if(ch == c) {
					count++;
				}
			}
			if(count==1) {
				l.add(ch);
			}
		}
		return l;
	}
	public static boolean validateEmail(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean result = email.matches(regex);
		return result;
	}
	public static void mergeString(String str1, String str2, int index) {
		String merge = str1.substring(0,index-1) +str2 + str1.substring(index-1);
		System.out.println("Merged String : "+merge);
	}
	private static Logger LOGGER = null;
	static {
		System.setProperty("java.util.logging.SimpleFormatter.format","%1$tF %1$tT : %5$s %n");
		LOGGER = Logger.getLogger(Program03.class.getName());
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter String : ");
		String str = br.readLine();
		System.out.println("");
		int countSpace = countNoOfSpace(str);
		Map<Character,Integer> map = countCharacter(str);
		List<Character> uniqueList = new ArrayList<>();
		List<Character> duplicateList = new ArrayList<>();
		map.forEach((key,count)->{
			if(count==1) {
				uniqueList.add(key);
			}else {
				duplicateList.add(key);
			}
		});
		System.out.println("Number of Space : "+countSpace);
		System.out.println("");
		System.out.println("Number of Unique Characters : "+uniqueList.size());
		System.out.println("Unique Characters : "+uniqueList);
		System.out.println("");
		System.out.println("Number of Duplicate Characters : "+duplicateList.size());
		System.out.println("Duplicate Characters : "+duplicateList);
		System.out.println("");
		
		System.out.print("Enter Number : ");
		int no = Integer.parseInt(br.readLine());
		int result = factorial(no);
		System.out.println("Factorial : "+result);
		System.out.println("");
		
		List<Character> list2 = new ArrayList<>();
		System.out.println("Character Insertion : ");
		while(true) {
			System.out.print("Want to Insert(y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'y') {
				System.out.print("Enter Character : ");
				char character = sc.next().charAt(0);
				list2.add(character);
				continue;
			}else if(ch == 'n') {
				break;
			}else {
				System.out.println("Incorrect Choice : Do Again");
				continue;
			}
		}
		System.out.println("");
		List<Character> list3 = removeDuplicates(list2);
		System.out.println("List with Duplicates Removed : "+list3);
		System.out.println("");
		
		System.out.print("Enter Email : ");
		String email = br.readLine();
		boolean flag = validateEmail(email);
		if(flag) {
			System.out.println("Valid Email Address");
		}else {
			System.out.println("Invalid Email Address");
		}
		System.out.println("");
		
		System.out.print("Enter 1st String : ");
		String str1 = br.readLine();
		System.out.print("Enter 2nd String : ");
		String str2 = br.readLine();
		System.out.print("Enter Index : ");
		int index = Integer.parseInt(br.readLine());
		mergeString(str1,str2,index);
		System.out.println("");
		
		LOGGER.info("SampleLog");
	}

}
