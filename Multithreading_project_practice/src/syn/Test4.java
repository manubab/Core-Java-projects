package syn;


class Account{
	double bal=10000.00;
	
	synchronized public double withdraw(double amt) {
		System.out.println("WithDraw process start ");
		System.out.println("before withdraw "+bal);
		
		if(bal<amt) {
			System.out.println(" Sorry insfficint bal wainting for deposit");
			try {
				//wait(10000);
				Thread.sleep(1000);
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		bal=bal=amt;
		System.out.println("After WithDraw :"+bal);
		return amt;
		
		
	}
     synchronized public void diposit(double damt) {
    	 System.out.println("deposit process starts");
    	 System.out.println("before Deposit :"+bal);
    	 bal=bal+damt;
    	 
    	 System.out.println("after deposit :"+bal);
		notifyAll();
	
     }
	
}



public class Test4 {
	public static void main(String[] args) {
		final Account acc=new Account();
		new Thread() {
			
			public void run() {
				acc.withdraw(5555500);
				
			}
			
		}.start();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread() {
			public void run() {
				acc.diposit(1000000);
			}
		}.start();
		
	}
	
	

}
