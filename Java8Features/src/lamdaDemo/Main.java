package lamdaDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = (x,y) -> {
			return(x+y);
		};
		System.out.println(s.calculate(10, 20));
		
		//Constructor
		MyClassInterface i = h -> new MyClass(h);
		i.get("Lamda Expression");
		
	}

}
