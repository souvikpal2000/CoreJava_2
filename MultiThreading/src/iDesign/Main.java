package iDesign;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of lines");
		int n = Integer.parseInt(br.readLine());
		Article a = null;
		for(int i=0;i<n;i++) {
			System.out.println("Enter line "+(i+1));
			String line = br.readLine();
			
			a = new Article(line);
			a.start();
			a.join();
		}
		System.out.println("There are "+a.getCount()+" articles in the given input");
	}

}
