package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		ArrayList<String> l3 = new ArrayList<>();
		l3.add("SOUVIK");
		l3.add("SANJIB");
		l3.add("BARNALI");
		
		List<String> l4 = l3.stream().map(s->s.toLowerCase()).sorted().collect(Collectors.toList());
		System.out.println(l4);
	}

}
