package interupt;

public class InturuptExample2 extends Thread
{
	
	public void run()
	{
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("Exception handled "+ie);
		}
		System.out.println("Thread is running ");
	}
	
	public static void main(String[] args) 
	{
		InturuptExample2 ob=new InturuptExample2();
		
		ob.start();
		
		try {
		ob.interrupt();
		
		}
		catch (Exception e) {
			System.out.println("Exception  "+e);
		}
	}

}
