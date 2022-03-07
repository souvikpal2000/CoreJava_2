import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		ArrayList<Integer> l = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			int no = obj.nextInt(10);
			l.add(no);
		}
		System.out.println(l);
		Set<Integer> s1 = new java.util.HashSet<>(l);
		Set<Integer> s2 = new LinkedHashSet<>(l);
		Set<Integer> s3 = new TreeSet<>(l);
		System.out.println(s1); //Sorted
		System.out.println(s2); //Same order
		System.out.println(s3); //Sorted
		
		//Iterator
		System.out.println("\nIterator\n");
		Iterator<Integer> i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\nNormal\n");
		//Normal
		for(Integer obj1 : s1) {
			System.out.println(obj1);
		}
	}

}
