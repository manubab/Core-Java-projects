package test1;
class A{
	
	A(){
		System.out.println("0-param con");
	}
	
	A(int a){
		System.out.println( a+ "parent con");
	}
}
public class Test extends A
{
	Test()
	{
		super();
		
		
		
		System.out.println("Child Param Con ");
	}
	
	
	public static void main(String[] args)
	{
		new Test();
		
	}

}
