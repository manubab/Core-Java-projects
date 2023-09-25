package reetraint;

class ReenTraint_Monitor1 {

	public synchronized void m() {

		n();

		System.out.println("this is m() ");
	}

	public synchronized void n() {
		System.out.println(" this is n() ");
	}

	public static void main(String[] args) {

	}

}

public class ReeTraintExample {
	public static void main(String[] args) {

		final ReenTraint_Monitor1 ob = new ReenTraint_Monitor1();

		Thread t1 = new Thread() {
		
		
		public void run()
		{
			ob.m();
			
		}
		};
		
		t1.start();

	}

}
