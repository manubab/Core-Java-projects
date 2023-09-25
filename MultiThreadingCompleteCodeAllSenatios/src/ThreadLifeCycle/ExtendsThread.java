package ThreadLifeCycle;

public class ExtendsThread  extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) 
	{
		ExtendsThread t1=new ExtendsThread();
		
		t1.start();
		
	}

}
