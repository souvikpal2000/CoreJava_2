import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill eb1 = new ElectricityBill();
		eb1.setMeterNo(123);
		eb1.setName("Souvik Pal");
		eb1.setAddress("Khardah");
		
		ElectricityBill eb2 = new ElectricityBill();
		eb2.setMeterNo(124);
		eb2.setName("Ram Mohan");
		eb2.setAddress("Barrackpore");
		
		ElectricityBill eb3 = new ElectricityBill();
		eb3.setMeterNo(123);
		eb3.setName("Souvik Pal");
		eb3.setAddress("Khardah");
		
		System.out.println(eb1);
		
		System.out.println(eb1.equals(eb2));
		System.out.println(eb1.equals(eb3));
		
		System.out.println("\nAdding into HashSet");
		
		HashSet<ElectricityBill> set = new HashSet<>(); //<--------------------------
		
		set.add(eb1);
		set.add(eb2);
		System.out.println(set.add(eb3));
		
		System.out.println(set.size());
		for(ElectricityBill e : set) {
			System.out.println(e);
		}
	}

}
