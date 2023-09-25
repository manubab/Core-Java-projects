package p2;

public class Selection {
    
	Avilable av=null;
	int seat=1;
	String name;
	
	public void booking(int seat,String name)
	{
		if(seat<=av.av)
		{
			System.out.println("Booked seat Successfuly "+new java.util.Date());
		}
		else {
			System.out.println("Sorry! seats are not avilable....!");
		}
	}
	
	
}
