
public class FinAvg {
	
	public static <T extends Number>void calculate(T[] arr) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			double no = arr[i].doubleValue();
			sum = sum + no;
		}
		System.out.println(sum/arr.length);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = new Integer[] {1,2,3,4,5};
		FinAvg.calculate(arr1);
		
		/*String[] arr2 = new String[] {"souvik", "pal"};
		FinAvg.calculate(arr2);*/
	}

}
