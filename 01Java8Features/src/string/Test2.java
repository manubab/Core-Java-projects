package string;

public class Test2 
{
	public static void main(String[] args) 
	{
		
		int a=10;
		
		a=a++ + ++a- a++ + ++a;
		
		System.out.println(" Start ");
		
		if(a>39)
		{
			System.out.println("Verified successfully");
		}
		else
		{
			System.out.println("invalid ");
		}
		System.out.println("end");
		
		
	}

}
