package interupt;

public class TestInterrupting extends Thread {

	public void run() {

		try {

			
			Thread.sleep(2000);

			System.out.println("Test");
		} catch (Exception e) {
			
			System.out.println( "Excep raise" +e);
		}
		
		System.out.println("The tread is running");

	}

	public static void main(String[] args) {

		TestInterrupting t1 = new TestInterrupting();

		t1.start();

		
			t1.interrupt();
		

	}
}
