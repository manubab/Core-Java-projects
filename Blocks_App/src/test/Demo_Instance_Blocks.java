package test;
public class Demo_Instance_Blocks {
	{
		int a=200;
		System.out.println("i am instance first block : "+a);
	}
	{
		int b=100;
		System.out.println("i am instance second block : "+ b);
	}
	public static void cal(int a,int b) {
		{
		    int c=	a+b;
			System.out.println(" i am local block of cal "+c);
		}
		  
		
	}
	
}
