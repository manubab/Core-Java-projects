package ThreadShedular;

public class ThreadSleepMethod extends Thread
{
	
	public  void run()
	{
		System.out.println(" Before Running run() ");
	    
		System.out.println("Run () is running");
	}
	
	public static void main(String[] args) 
	{
		ThreadSleepMethod t11=new ThreadSleepMethod();
		t11.start();
		
		try
		{
			Thread.sleep(-1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
