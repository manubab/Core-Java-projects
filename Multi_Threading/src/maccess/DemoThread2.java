package maccess;

public class DemoThread2 {
	public static void main (String [] args)
	{
		new Thread(()->{
			for(int i=1;i<=5;i++)
			{
			System.out.println("Registation process by Ram...."+new java.util.Date());
			try {
				
			
			Thread.sleep(1200);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			}
		}).start();
		
		new Thread(()->{
			for(int i=1;i<=5;i++) {
				System.out.println("Login Process by Alex ..."+new java.util.Date());
				try {
				Thread.sleep(1200);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}).start();
		
		
	}

}
