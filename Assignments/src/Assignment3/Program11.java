package Assignment3;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = -1;
		for(int i=1;i<=4;i++) {
			flag = flag + 2;
			for(int j=1;j<=i;j++) {
				System.out.print(flag+" ");
			}
			System.out.println("");
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(flag+" ");
			}
			flag = flag - 2;
			System.out.println("");
		}
	}

}
