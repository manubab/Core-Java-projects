package ThreadLifeCycle;



public class TwoThreadState implements Runnable
{

	public static Thread t1;
	
	public static TwoThreadState obj;
	
	public static void main(String[] args) {
		
		obj=new TwoThreadState();
		
		t1=new Thread(obj);
		
		
		System.out.println("The state of theread t1 after swapping it -"+t1.getState());
		
		t1.start();
		
		System.out.println("The state of theread t1 after invoking it -"+t1.getState());
	}
	
	public void run()
	{
		
		Abc myObj=new Abc();
		
		Thread t2=new Thread(myObj);
		
		System.out.println("The state of thread t2 after swapping it - "+t2.getState() );
		
		t2.start();
		
		System.out.println("The state of thread t2 after calling the method  start() on it -"+t2.getState());
		
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		
		System.out.println("The state of thread t2 after invoking the method sleep on it- "+t2.getState() );
		
		
		try
		{
			t2.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
			
		}
		
		System.out.println("The state of thread t2 ofter Completion of thread excecution -"+ t2.getState());
	}
	

}

class Abc implements Runnable
{
	
	public void run()
	{
		try {
		Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		System.out.println("Thread state of thead t1 while it method join()  on Thread2 " +TwoThreadState.t1.getState());                                                     
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) 
		{
			
			
			e.printStackTrace();
		}
		
	}
}
