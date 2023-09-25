package test;


class A1
{
	static int a=10;
	int x=20;
	
	static void m1()
	{
		System.out.println(" A1 m1");
	}
	
	void m2()
	{
		System.out.println("A1 m2");
	}
	
	void m3()
	{
		System.out.println("A1  m3");
		System.out.println("A.a :"+a);
		System.out.println("A.x :"+x);
		m1();
		m2();
	}
}

class A2 extends A1
{
	static int a=50;
	int x=60;
	
	static void m1()
	{
		System.out.println("A2 m1");
	}
	
	void m2()
	{
		System.out.println("A2 m2");
		System.out.println("A2.a :"+a);
		System.out.println("A2.x :"+x);
	}
	
	void m4()
	{
		super.a=a-10;
		super.x=x-10;
	}
}


public class Test1 
{
	public static void main(String[] args)
	{
		
		A2 a1=new A2();
		A2 a2=new A2();
		
		A1 a=new A1();
		
		a1.a=15;
		a1.x=16;
		
		a2.a=18;
		a2.x=19;
		
		
		a1.m4();
		a2.m4();
		
		a1.m3();
		System.out.println();
		a2.m3();
		
		
		System.out.println();
		
		System.out.println(a1.a);
		System.out.println(a1.x);
		System.out.println(a.a);
		System.out.println(a.x);
		
	}

}
