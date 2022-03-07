package WithoutLamda;

public class Main {
	
	public int myMethod(int x, int y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ob = new Main();
		Sum s = ob::myMethod;
		int result = s.calculate(10,20);
		System.out.println(result);
	}

}
