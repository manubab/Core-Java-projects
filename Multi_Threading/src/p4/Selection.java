package p4;

public class Selection {
	public synchronized static void select(int n,String name)
	{
		if(n<=Available.av)
		{
			System.out.println(n+"Seats booked for "+name+"DateTime :"+new java.util.Date());                         
            Available.av=Available.av-n;
            
		}
		else {
			System.out.println("Sorry! no Seats Available"+ name);
		}
		
	}

}
