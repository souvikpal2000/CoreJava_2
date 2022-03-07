package ComparableDemo;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter number of users:");
		int n = Integer.parseInt(br.readLine());
		
		Set<User> s = new TreeSet<>(); // <----------------------------
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter details of user"+i);
			System.out.println("Username:");
			String username = br.readLine();
			System.out.println("Bank name:");
			String bank = br.readLine();
			
			User u = new User(username, bank);
			s.add(u);
		}
		for(User u : s) {
			System.out.println(u);
		}
        
	}
}
