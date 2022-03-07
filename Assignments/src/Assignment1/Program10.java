package Assignment1;

public class Program10 {
	static void displayMultiplicationMatrix() {
		int arr[][] = new int[13][13];
		for(int i=0;i<13;i=i+1) {
			arr[0][i] = i;
			if(i>=1) {
				arr[i][0] = i;
			}
		}
		for(int i=1;i<13;i=i+1)
		{
			for(int j=1;j<13;j=j+1) {
				arr[i][j] = arr[i][0] * arr[0][j];
			}
		}
		for(int i=0;i<13;i++) {
			for(int j=0;j<13;j++) {
				System.out.format("%6d",arr[i][j]);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program10.displayMultiplicationMatrix();
	}

}
