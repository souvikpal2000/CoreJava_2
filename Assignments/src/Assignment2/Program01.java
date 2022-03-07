package Assignment2;

public class Program01 {
	static int check(String sentence, String word) {
		String a[] = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
		if (word.equals(a[i]))
			count++;
		}
		return count;
	}
	public static void main(String args[]){
	String str = "We are undergoing an internship conducted by PSL for six months. We are not going to college";
	String word = "We";
	System.out.println(check(str, word));
	}
}
