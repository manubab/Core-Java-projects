package deadlock;

public class Thread1 {

	public static void main(String[] args) {
		final String resource1 = "ratan jaiswal";

		final String resource2 = "vimal jasiwal";

		Thread t1 = new Thread() {

			@Override
			public void run() {
				synchronized (resource1) {

					System.out.println("Thread 1 :locked re 1");

					try {
						Thread.sleep(3000);

					} catch (Exception e) {
					}
					synchronized (resource2) {
						System.out.println("Thread 1 :locked re 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}

		};
		
		t1.start();
		
		t2.start();
	}

}
