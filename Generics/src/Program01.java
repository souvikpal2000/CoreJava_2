
public class Program01<T> {
	T value;
	Program01(T value){
		this.value = value;
	}
	public T printValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program01<Integer> s1 = new Program01<Integer>(new Integer(51));
		System.out.println(s1.printValue());
		Program01<String> s2 = new Program01<String>(new String("Hello!!"));
		System.out.println(s2.printValue());

	}

}
