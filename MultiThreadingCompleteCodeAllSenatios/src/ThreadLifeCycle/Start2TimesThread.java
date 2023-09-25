package ThreadLifeCycle;


public class Start2TimesThread  extends Thread
{
	
	
	public void run()
	{
		
		System.out.println("run is working and state "+ Thread.currentThread().getState());
		
		try
		{
			Thread.sleep(12000);
			System.out.println();
			
	     new RuntimeException().getStackTrace();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Start2TimesThread t1=new Start2TimesThread();
		t1.setDaemon(true);
		
		t1.start();
		
		
	}

}
