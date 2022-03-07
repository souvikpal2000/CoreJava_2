package ComparatorDemo;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Employee> set = new TreeSet<>(new EmployeeIdComparator());
		TreeSet<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		Employee e1 = new Employee(2, "Souvik Pal");
		Employee e2 = new Employee(1, "Sanjib Pal");
		Employee e3 = new Employee(3, "Barnali Pal");
		set.add(e1);
		set.add(e2);
		set.add(e3);
		for(Employee e : set) {
			System.out.println(e);
		}
	}

}
