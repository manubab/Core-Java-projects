package p2;

public class Selection {
	public void select(int n,String name)
	{
		if(n<=Available.av)
		{
			System.out.println(n+" Seats booked for "+name+"DateTime :"+new java.util.Date());
			Available.av=Available.av-n;
			
		}else {
			System.out.println("Sorry ! No Seats available for "+name );
		}
	}

}
