package Assignment3;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=-1;
		for(int i=1;i<=5;i++) {
			for(int s=5;s>i;s--) {
				System.out.print(" ");
			}
			k = k + 2;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
			}
			System.out.println("");
		}
		for(int i=5;i>=1;i--) {
			for(int s=5;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
			}
			k = k - 2;
			System.out.println("");
		}
	}

}
