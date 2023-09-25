package syn;







class MyThread5 extends Thread{
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName()+".."+t1.isDaemon());
		for(int i=1;i<=10;i++) {
			System.out.println(i+".run :"+t1.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}




public class Test5 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+"...."+t.isDaemon());
		MyThread5 mt5=new MyThread5();
		mt5.setName("java");
		mt5.setDaemon(true);
		mt5.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+".main :"+t.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
