package test;

public class Register1 {
	public static void reg()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Registration process by Ram..."+new java.util.Date());
			try {
			Thread.sleep(1200);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
