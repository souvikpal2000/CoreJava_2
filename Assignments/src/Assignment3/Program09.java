package Assignment3;

import java.io.*;
import java.util.*;
public class Program09 {
	public static void displayFibonacci(int n) {
		List<Integer> list = new ArrayList<>();
		int a = 0;
		int b = 1;
		list.add(a);
		list.add(b);
		
		int c;
		int i=3; 
		while(i<=n) {
			c = a + b;
			list.add(c);
			a = b;
			b = c;
			i++;
		}
		System.out.println("Fibonacci Series : "+list);
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Number of Terms : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("");
		displayFibonacci(n);
	}

}
