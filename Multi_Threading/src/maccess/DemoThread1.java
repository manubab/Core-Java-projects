package maccess;

public class DemoThread1 {
	public static void main(String [] args)
	{
		Runnable r=new Runnable()
				{
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Registration Process by Ram.."+new java.util.Date());
					try {
						Thread.sleep(1200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
				};
				
				Runnable R=new Runnable()
						{
				public void run()
					{
					for(int i=1;i<=5;i++)
					{
						System.out.println("Login Process by Alex..."+new java.util.Date());
						try {
							Thread.sleep(1200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
						
					}
						};
						
						Thread t1=new Thread(r);
						Thread t2=new Thread(R);
						t1.start();
						t2.start();
	}

}
