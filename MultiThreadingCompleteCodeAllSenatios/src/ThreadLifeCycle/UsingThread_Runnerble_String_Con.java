package ThreadLifeCycle;

public class UsingThread_Runnerble_String_Con implements Runnable
{
	 UsingThread_Runnerble_String_Con con;
	
	public void run()
	{
		System.out.println("Now the Thread is running");
		
		Thread t1=new Thread(con ,"T1");
		
		System.out.println(t1.getName());
		t1.start();
		
		System.out.println("Now the Thread is running");
		
	}
	
	public static void main(String[] args) {
		
		 UsingThread_Runnerble_String_Con con=new UsingThread_Runnerble_String_Con();
		Thread t1=new Thread(con);
		
		t1.start();
		
		System.out.println(t1.getName());
	}
	

}
