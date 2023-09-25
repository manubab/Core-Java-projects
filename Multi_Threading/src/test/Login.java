package test;

public class Login implements Runnable {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Login process by Ram.."+new java.util.Date());
			try {
				Thread.sleep(1200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
