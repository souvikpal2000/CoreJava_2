
public class ThreadDemo01 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadDemo01 td1 = new ThreadDemo01();
		ThreadDemo01 td2 = new ThreadDemo01();
		td1.start();
		td2.start();

	}
	public void run() {
		for(int j=1;j<=10;j=j+1) {
			System.out.println(j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
