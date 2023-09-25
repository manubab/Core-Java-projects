package p2;

public class User2 implements Runnable {
	
		public Selection s1;
		public User2(Selection s1)
		{
			this.s1=s1;
			
		}public void run()
		{
			synchronized(s1)
			{
				s1.select(1, "Alex");
			}
		}
	

}
