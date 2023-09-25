package Test;
class MyThread1 extends Thread{
	public void run	()  //step 2
	{
		for(int i=0;i<=10;i++) {
			System.out.println("Thread1 :"+i);
			try {
			Thread.sleep(1200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

class MyThread2 extends Thread{
	public void run	()  //step 2
	{
		for(int i=11;i<=20;i++) {
			System.out.println("Thread2 :"+i);
			try {
			Thread.sleep(1200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class Demo_Thread {
	public static void main(String[] args)
	{
		MyThread1 obj=new MyThread1();
		MyThread2 obj1=new MyThread2();

		obj.start();//Step 4
		obj1.start();
	}

}
