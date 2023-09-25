package p2;

public class User1 implements Runnable{
	public Selection s1;
	
	public User1(Selection s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		synchronized(s1)
		{
			s1.select(1, "Ram");
		}
	}

}
