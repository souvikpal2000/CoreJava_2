package readerwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args){
		BufferedReader br = null;
		try {
			EventBO bo = new EventBO();
			br=new BufferedReader(new FileReader("input.txt"));
			List<Event> l = bo.readFromFile(br);
			
			FileWriter writer = new FileWriter("output.txt");   
			bo.writeFile(l,writer);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try{
				br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}

