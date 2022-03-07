package readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EventBO {
	//fill your code here
	public List<Event> readFromFile(BufferedReader br){
		List<Event> lu = null;
		Set<String> set = new HashSet<String>();
		try {
			String line;
			lu = new ArrayList<>();
			while((line = br.readLine()) != null) {
				String[] att = line.split(",");
				if (att.length==3 && (set.isEmpty() || !set.contains(att[2]))) {
					set.add(att[2]);
					Event event = new Event(att[0], Integer.parseInt(att[1]), att[2]);
					lu.add(event);
				}
			}
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lu;
	}
	void writeFile(List<Event> eventList,FileWriter fr){
		BufferedWriter buffer = null;
		try {
			buffer = new BufferedWriter(fr);
			for(Event e:eventList)
			{ 
				String str = e.getName()+","+e.getAttendeesCount()+","+e.getOwnerName();
				buffer.write(str);
				buffer.write("\n");
			}
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

