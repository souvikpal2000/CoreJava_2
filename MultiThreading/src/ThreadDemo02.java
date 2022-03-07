import java.util.*;
public class ThreadDemo02 extends Thread{
	static int n = 0, sum=0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of n : ");
		ThreadDemo02.n = sc.nextInt();
		
		ThreadDemo02 td = new ThreadDemo02();
		td.start();
		td.join();
		
		System.out.println("Summation : "+sum);

	}
	
	public void run() {
		for(int i=0;i<=ThreadDemo02.n;i++) {
			ThreadDemo02.sum = ThreadDemo02.sum + i;
		}
	}

}
