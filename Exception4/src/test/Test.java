package test;
public class Test extends Exception
{
	public Test(String msg) {
		super(msg);
	}
	
	int fact=1;
	
	public void factorial(int n)
	{
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial :"+fact);
		
	}
	

}
