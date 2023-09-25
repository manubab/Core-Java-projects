package ThreadLifeCycle;

public class SingleThreadState implements Runnable {

	public void run() {
		System.out.println("Run method started and working");
	}
	
	

	public static void main(String[] args) {
		SingleThreadState sts = new SingleThreadState();

		Thread t1 = new Thread(sts);

		System.out.println("before runnering " + t1.getState());

		t1.start();
		System.out.println("after started  " + t1.getState());
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			try {
				System.out.println("The state of the Thread "+t1.getState());
				t1.join();
			} catch (InterruptedException e1) {
			
				e1.printStackTrace();
			}
		}

		System.out.println("after executing thread "+t1.getState());
	}

}
