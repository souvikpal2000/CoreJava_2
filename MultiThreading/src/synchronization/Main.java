package synchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "Souvik");
		MyThread t2 = new MyThread(dm, "Pal");
		
		t1.start();
		t2.start();
	}

}
