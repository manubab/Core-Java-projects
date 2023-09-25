package ThreadLifeCycle;



public class ImplRunnable implements Runnable{

	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) 
	{
		ImplRunnable t1=new ImplRunnable();
		
		new Thread(t1).start();	
		
	   Thread t2=new Thread("manu thread ");
	   
	  // t2.start();
	   
	   System.out.println(t2.getName());
		
	   
	   
	}
}
