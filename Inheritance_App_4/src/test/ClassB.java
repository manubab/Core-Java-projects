package test;
public class ClassB extends ClassA{
	public static int b;
	
	static
	{
		System.out.println("====Cclass SB=====");
		System.out.println("The value of b :"+b);
	} 
	{
		System.out.println("=======C class IB ======");
		System.out.println("The value of b:"+b);
	}

}
