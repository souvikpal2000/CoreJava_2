import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		
		ListIterator<Integer> i = l.listIterator();
		System.out.println("Iterating in forward direction");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\nIterating in backward direction");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
