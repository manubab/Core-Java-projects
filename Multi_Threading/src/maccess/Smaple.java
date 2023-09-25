package maccess;

class SynchronizedBlock {

	public void print(int n) {
		 SynchronizedBlock sb = null;
		synchronized (sb) {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println(i * n);
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}

class Thread1 extends Thread
{
	SynchronizedBlock sb;
	
	Thread1(SynchronizedBlock sb)
	{
		this.sb=sb;
		
	}
	public void run()
	{

		System.out.println(5);
	}
	
	
}
class Thread2 extends Thread
{
	SynchronizedBlock sb;
	
	Thread2(SynchronizedBlock sb)
	{
		this.sb=sb;
	}
	public void run()
	{
		System.out.println(10);
	}
	
}


class Thread3{
	
	public synchronized static void print(int n){
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+i);
		}
	    try {
		Thread.sleep(1000);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
	
}

class T1 extends Thread{
	public void run()
	{
		Thread3.print(10);	
	}
}
class T2 extends Thread{
	public void run()
	{
		Thread3.print(5);
	}
}


public class Smaple{
	public static void main(String[] args) {
		SynchronizedBlock s=new SynchronizedBlock();
		Thread1 t1=new Thread1(s);
		Thread2 t2=new Thread2(s);
		
		t1.start();
		t2.start();
		
		
		T1 t11=new T1();
		T2 t22=new T2();
		
		t11.start();
		t22.start();
		
		
	      
	}
}


