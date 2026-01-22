// 22/01/2026

public class CreatingThreadUsingInterface implements Runnable{
	public void run() {
		System.out.println("Runnable thread is running");
	}
	public static void main(String[] args) {
		CreatingThreadUsingInterface ctui = new CreatingThreadUsingInterface();
		Thread t1 = new Thread(ctui);
		t1.start();
	}
}
