package arraylistandmapping;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException{
		//Your code here
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		ArrayList<Address> l = new ArrayList<>();
		Map<String, ArrayList<Address>> map = new HashMap<>();

		System.out.println("Enter the number of address");
		int n = Integer.parseInt(br.readLine());
		String line;
		String add1,add2,city,state;
		int pincode;
		for(int i=1;i<=n;i=i+1){
			System.out.println("Enter the address "+i+" detail");
			line = br.readLine();
			String[] lineVector = line.split(",");
			add1 = lineVector[0];
			add2 = lineVector[1];
			city = lineVector[2];
			state = lineVector[3];
			pincode = Integer.parseInt(lineVector[4]);
			Address a = new Address(add1,add2,city,state,pincode);
            if (map.containsKey(city)) {
                l = map.get(city);
                l.add(a);
                map.replace(city, l);
            } else {
                l = new ArrayList<>();
                l.add(a);
                map.put(city, l);
            }
		}
		System.out.println("Enter the city to be searched");
		String search = br.readLine();

		if(map.containsKey(search)){
			System.out.println("Line 1          Line 2          City            State           Pincode");
			ArrayList<Address> list = map.get(search);
            for (Address a : list) {
                add1 = a.getAddressLine1();
                add2 = a.getAddressLine2();
                city = a.getCity();
                state = a.getState();
                pincode = a.getPincode();

                System.out.printf("%-15s %-15s %-15s %-15s %s\n", add1, add2, city, state, pincode);
            }
            
		}
		else{
			System.out.println("Searched city not found");
		}
	}

}

