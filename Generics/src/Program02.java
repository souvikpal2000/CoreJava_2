
public class Program02 {
	
	public static <T>void printArray(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"souvik", "pal"};
		Program02.printArray(arr);
		
		Double[] d = new Double[] {0.99, 0.5, 0.11111};
		Program02.printArray(d);
	}

}
