package test;

class Producer implements Runnable{
	StringBuffer sb=null;
	
	public Producer() {
		sb=new StringBuffer();
	}
	public void run()
	{
		try {
			synchronized(sb) {
		for(int i=1;i<=10;i++)
		{
			sb.append(i+" : ");
			System.out.println("Producer Producess the Data....!");
			
			Thread.sleep(2000);
		sb.notify();	
		}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
class Consumer implements Runnable{
	public Producer prod=null;
	
	Consumer(Producer prod)
	{
		this.prod=prod;
	}
   public void run()
	{
		try {
			synchronized(prod.sb) {
				System.out.println("Consumer started .....but blocked .....");
				prod.sb.wait();
				System.out.println(prod.sb.toString());
			}
			
		}catch(Exception e) {
			
		}
	}
}

public class DemoThread
{
	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t2.start();
		t1.start();
	}
	
}
