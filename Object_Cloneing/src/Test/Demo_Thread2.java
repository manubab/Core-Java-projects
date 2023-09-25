package Test;
class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("The value :"+ i);
			try {
			Thread.sleep(1200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
public class Demo_Thread2 {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		
		t1.start();
		t2.start();
	}

}
