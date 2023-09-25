package test;

public class Registraction implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Registraction user 1"+new java.util.Date());
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
