
import java.util.ArrayList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		System.out.println("List : "+list);
		list.add(2,100);
		System.out.println("List After Inserting : "+list);
		list.set(3, 200);
		System.out.println("List After Replacing : "+list);
		
		List<Integer> secondlist = new ArrayList<Integer>();
		secondlist.add(1);
		secondlist.add(2);
		secondlist.add(3);
		System.out.println("Second List : "+secondlist);
		
		list.addAll(2,secondlist);
		
		System.out.println("1st List After Insertion : "+list);
		
		if(list.contains(210)) {
			System.out.println("List has the Value");
		}
		else {
			System.out.println("List doesn't has the value");
		}
		
		System.out.println("Printing list value in new Line : ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(2);
		System.out.println("After removing an element from list : "+list);
	}

}
