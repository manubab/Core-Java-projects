package ThreadLifeCycle;

public class RunManualCall extends Thread {

	public void run() {
		System.out.println("I am run");
	}

	public static void main(String[] args) {
		
		
     RunManualCall	 r1=new RunManualCall();
     
     r1.start();
		
	}

}
