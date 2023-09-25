package test;

public enum Cars {
	Range(400),Volvo(500),BMW(600);
	public int price;
	Cars(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	{
		System.out.println("----block----");
	}
	static
	{
		System.out.println("---------static block--------");
	}

}
