package threadgroup;

class ThreadNew extends Thread
{
	ThreadNew(String tName,ThreadGroup tgrp)
	{
		super(tgrp,tName);
		start();
	}
	
	public void run()
	{
		for(int i=1;i<100;i++)
		{
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println("The exception have been encountered "+ e);
			}
		}
	}
}

public class ActiveCountExample {

	public static void main(String[] args)
	{
		
		ThreadGroup tg=new ThreadGroup("The Parent Group of threads");
		
		ThreadNew threadNew1=new ThreadNew("first", tg);
		
		System.out.println("starting the first");
		
		ThreadNew th1=new ThreadNew("secound", tg);
		
		System.out.println("Starting the secound");
		
		ThreadNew  threadNew3=new ThreadNew("third", tg);
		
		System.out.println("Staring the Third");
		
		System.out.println(" The total number of active threads are :"+tg.activeCount());
		
		
		System.out.println("Name of the Third thread :"+threadNew3.getName());
	

	}

}
