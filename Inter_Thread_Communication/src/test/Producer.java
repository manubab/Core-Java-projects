package test;

public class Producer implements Runnable{
	StringBuffer sb=null;
	public Producer()
	{
		sb=new StringBuffer();
		
	}
	public void run()
	{
		try {
			synchronized(sb)
			{
				for(int i=1;i<=10;i++)
				{
					sb.append(i+" : ");
					System.out.println("Producere Appending data .......!");
					Thread.sleep(1000);
				}
				sb.notify();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
