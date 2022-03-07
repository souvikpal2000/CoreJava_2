
public class InterruptDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InterruptDemo id = new InterruptDemo();
		id.start();
		id.interrupt();
		System.out.println("End of Main Method");
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Child Method");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("Got Intrrupted");
		}
	}
}
