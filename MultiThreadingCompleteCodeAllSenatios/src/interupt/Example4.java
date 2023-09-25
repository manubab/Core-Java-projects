package interupt;

public class Example4 extends Thread
{
	
	public void run()
	{
		
		
		for(int i=1;i<=3;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("code for interpted thrread");
			}else
			{
				System.out.println("Code for normal thread");
			}
				
		}
	}
	
	public static void main(String[] args) {
		
		
		Example4 t1=new Example4();
		
		Example4 t2=new Example4();
		
		t1.start();
		
		t1.interrupt();
		
		t2.start();
		
	}

}
