// 22/01/26

public class CreatingThreadUsingClass extends Thread{
	
	public void run() {
		System.out.println("Thread is running");
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" - Count: "+i);
			
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println("Thread interrupted");
			}
		}
		
	}
	public static void main(String[] args) {
		CreatingThreadUsingClass ctuc1 = new CreatingThreadUsingClass();
		CreatingThreadUsingClass ctuc2 = new CreatingThreadUsingClass();
		ctuc1.setName("Thread ctuc1");
		ctuc2.setName("Thread ctuc2");
		
		ctuc1.start();
		ctuc2.start();
		
	}
}
