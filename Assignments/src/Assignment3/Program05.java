package Assignment3;

import java.io.*;
public class Program05 {
	public static int findGcd(int no1, int no2) {
		int max=0,min=0,r=1,gcd=0;
		if(no1>no2){
			max = no1;
			min = no2;
		}else{
			max = no2;
			min = no1;
		}
		while(r>0){
			r = max%min;
			if(r==0){
				gcd = min;
				break;
			}
			max = min;
			min = r;
		}
		return gcd;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter 1st Number : ");
		int no1 = Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd Number : ");
		int no2 = Integer.parseInt(br.readLine());
		int gcd = findGcd(no1,no2);
		int lcm = (no1/gcd)*no2;
		System.out.println("GCF : "+gcd);
		System.out.println("LCM : "+lcm);
	}

}
