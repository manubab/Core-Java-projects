package syn;

//      if any thread executing static -synchronized methods
 //      reaming threads are unable to executes same other static- synchronized methods but can executes 
//      the following methods 
//       a.static non-synchronized methods 
//       b.non-static synchronized methods
//       c.non-static non-synchronized methods

class Institute2{
	public static synchronized void classRoom(String fn) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+". class Talking by "+fn);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void exam() {
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"writing exam "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class MyThread2 extends Thread{
	Institute2 ins;
	String fn;
	
	public MyThread2(Institute2 ins,String fn) {
		this.ins=ins;
		this.fn=fn;
		
	}
	
	public void run() {
		ins.classRoom(fn);
	}
	
	
}


public class Test2 {
	public static void main(String[] args) {
		Institute2 ins=new Institute2();
		MyThread2 mt1=new MyThread2(ins,"manu");
		MyThread2 mt2=new MyThread2(ins,"manohar");
		mt1.start();
		mt2.start();
		ins.exam();//main
	}
	
	


	

}
