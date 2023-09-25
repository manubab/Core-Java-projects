package syn;

class Institute1{
  synchronized public void classRoom(String fn) { 
    	for(int i=1;i<=10;i++) {
    		System.out.println(i+" class Taken by mr :"+fn);
    		
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
 synchronized public void exam() {
	  for(int i=0;i<=10;i++) {
		  System.out.println(i+" writing"+Thread.currentThread().getName());
		  
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  }
  }
}

class MyThread1 extends Thread{
	
	Institute1 ins;
	String fn;
	
	public void run() {
		ins.classRoom(fn);
		
	}
	MyThread1(Institute1 ins,String fn){
		this.ins =ins;
		this.fn=fn;
		
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		Institute1 ins=new Institute1();
		MyThread1 mt1=new MyThread1(ins,"manohar");
		MyThread1 mt2=new MyThread1(ins,"manu");
		
		mt1.start();
		//mt2.start();
		
		ins.exam();

	}

}
