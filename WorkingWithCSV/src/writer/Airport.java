package writer;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Airport{
    public static void main(String args[]){
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        BufferedWriter buffer = null;
        try {
            System.out.println("Enter the name of the airport");
            String airport = br.readLine();
            System.out.println("Enter the city name");
            String name = br.readLine();
            System.out.println("Enter the country code");
            String code = br.readLine();

            FileWriter writer = new FileWriter("airport.csv");  
            buffer = new BufferedWriter(writer);

            String str = airport+","+name+","+code;
			buffer.write(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
