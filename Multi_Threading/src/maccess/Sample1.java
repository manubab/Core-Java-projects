package maccess;

class MyThread extends Thread
{
	int total=0;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				total=total+i;
				this.notify();
			}
		}
	}
	
}

public class Sample1 {
	public static void main(String[] args) {
		MyThread ob1=new MyThread();
		ob1.start();
		
		synchronized(ob1)
		{
			try {
				ob1.wait();
				System.out.println(ob1.total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
