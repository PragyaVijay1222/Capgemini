// 22-01-26
// Thread Schedular

package MultiThreading;

public class ThreadSchedular extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		ThreadSchedular ts1 = new ThreadSchedular();
		ThreadSchedular ts2 = new ThreadSchedular();
		ThreadSchedular ts3 = new ThreadSchedular();
		ThreadSchedular ts4 = new ThreadSchedular();
		
		ts1.start();
		ts2.start();
		ts3.start();
		ts4.start();
	}
}
