package writer;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());
		String line;
		ArrayList<User> l = new ArrayList<>();
		for(int i=1;i<=n;i=i+1){
			System.out.println("Enter the details of user :"+i);
			line = br.readLine();
			String[] att = line.split(",");
			User u = new User(att[0],att[1],att[2],att[3]);
			l.add(u);
		}
		FileWriter writer = new FileWriter("D:\\Eclipse Workspace\\WorkingWithCSV\\src\\output.csv");  
    	BufferedWriter buffer = new BufferedWriter(writer);  
		UserBO.writeFile(l,buffer);
	}
}
