package test;

class Avilable{
	public int seat=1;
    	
}
class Selection{
	public Avilable av=null;
	public String name=null;
	public int seat;
	
	public Selection(Avilable av,String name)
	{
		
		this.av=av;
		this.name=name;
		
		
	}
	public void getSeat()
	{
		if(seat<av.seat)
		{
			System.out.println("Booked Seat ");
		}else {
			System.out.println("Sorry seat are not avilable.....!");
		}
		
			
	}
	
	
}


public class DemoThread {

}
