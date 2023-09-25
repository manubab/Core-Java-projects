package test;

public class ClassA {
	public static int a;
	
	
	
	static
	{
		System.out.println("=====Pclass SB =====");
		System.out.println(" The value of a : "+a);
		
		
	}
	{
		System.out.println("=======P class IB ======");
		System.out.println("The value of a: "+a);
	}

}
