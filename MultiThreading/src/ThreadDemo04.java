
public class ThreadDemo04 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo03 ob = new ThreadDemo03(); 
		Thread t = new Thread(ob);
		t.start();
		t.join(); //Main Thread executes only after Child Thread Terminated
		
		for(int i=0;i<10;i=i+1) {
			System.out.println("Main Thread "+i);
		}
	}
	public void run() {
		for(int i=0;i<10;i=i+1) {
			System.out.println("Child Thread "+i);
		}
	}
}

