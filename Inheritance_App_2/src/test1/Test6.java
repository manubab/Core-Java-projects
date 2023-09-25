package test1;

class A12
{
	static int a=10;
	int x=20;
	
	static void m1()
	{
		System.out.println("A12 m1");
	}
	void m2()
	{
		System.out.println("A12 m2");
		
	}
	void m3()
	{
		System.out.println("A12 m3 ");
		
		System.out.println("A12.a :"+a);
		System.out.println("A12.x :"+x);
		m1();
		m2();
	}
	
}

class B12 extends A12{
	static int a=50;
	int x=60;
	
	static void m1()
	{
		System.out.println(" B12 m1");
	}
	
	void m2()
	{
		System.out.println("B m2");
		
		System.out.println("B.a :"+a);
		System.out.println("B.x :"+x);
	}
	void m4()
	{
		super.a=a-10;
		super.x=x-10;
	}
}

public class Test6
{
	public static void main(String[] args) 
	{
		
		B12 b1=new B12();
		B12 b2=new B12();
		A12 a1=new A12();
		
		b1.a=15;
		b1.x=16;
		
		b2.a=18;
		b2.x=19;
		
		b1.m4();
		b2.m4();
		
		
		b1.m3();
		
		System.out.println();
		b2.m3();
		
		System.out.println();
		
		System.out.println(b1.a);
		System.out.println(a1.a);
		System.out.println(b1.a);
		System.out.println(a1.x);
		
		
		
		
	}

}
