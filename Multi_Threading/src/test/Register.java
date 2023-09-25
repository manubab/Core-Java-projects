package test;

public class Register implements Runnable {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Registration processby Ram...."+new java.util.Date());
			try {
				Thread.sleep(1200);
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
	}

}
