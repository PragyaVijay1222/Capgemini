// 22/01/2026

public class DaemonThread {
	public static void main(String[] args) {
		Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Daemon interrupted");
                }
            }
        });
        daemonThread.setDaemon(true);

        daemonThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread running: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread finished");
	}
}
