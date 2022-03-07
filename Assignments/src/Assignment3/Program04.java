package Assignment3;

import java.io.*;
import java.util.*;
public class Program04 {
	public static List<String> readFile(BufferedReader br){
		List<String> list = new ArrayList<>();
		String line;
		try {
			while((line=br.readLine()) != null) {
				if(line.length() >= 3) {
					String[] lineVector = line.split(",");
					list.add(lineVector[2]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Map<String,Integer> countCity(List<String> cities){
		Map<String, Integer> map = new LinkedHashMap<>();
		for(String city : cities) {
			if(map.containsKey(city)) {
				map.put(city, map.get(city)+1);
			}else {
				map.put(city, 1);
			}
		}
		return map;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=null;
		br = new BufferedReader(new FileReader("D:\\Eclipse Workspace\\Assignments\\src\\Assignment3\\input.txt"));
		List<String> list = readFile(br);
		Map<String,Integer> map = countCity(list);
		map.forEach((key, value)->{
			System.out.println(key+" : "+value);
		});
	}

}
