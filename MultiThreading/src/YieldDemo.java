
public class YieldDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		YieldDemo yd = new YieldDemo();
		yd.start();
		
		for(int i=0;i<10;i=i+1) {
			System.out.println("In Main");
		}
		
	}
	public void run() {
		for(int i=0;i<10;i=i+1) {
			System.out.println("In Child");
			Thread.yield(); //Child Thread executes only after Main Thread terminated
		}
	}
}
