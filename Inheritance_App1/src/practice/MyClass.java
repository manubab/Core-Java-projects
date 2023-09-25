package practice;

class A
{
	void m1()
	{
		System.out.println("m1  method()");
	}
}

class B 
{

	void m2()
	{
		System.out.println("child class m2");
	}
	
}

class C extends B
{
	void m3()
	{
		
	}
}

public class MyClass
{
   public static void main(String[] args) {
	
	   C ob=new C();
	   
	   ob.m1();
	   ob.m2();
	   ob.m3();
}
	
}
 
