package Oops;

/*public class A {
	{
		int a= 10;
		int b=20;
		int c=a+b;
		c=b+a;
		b=a;
		int D=a+b;
		int febinoci=a+b;
		febinoci=D+c;
		for(int i=0;i<=20;i++) {
			febinoci++;
			System.out.println(febinoci);
		}
		System.out.println(" non static ");
		
		
			
		
	}
	static
	{
		System.out.println(" i am static ");
	}
	
	public static void main(String[] args) {
		{
			
			
			System.out.println(" instance block");
			int a=10;
			int b=20;
			int total=a+b;
			System.out.println(total);
				
			}
		
			A a= new A();
			
		
	}
}*/

public class A{
	void a() {
		System.out.println("a");
	
		
	}
	public static void main(String[] args) {
		
	}
}
class B extends A{
	void a() {
		super.a();
		System.out.println("b");
	}
	
}
		
			
		
	
		
		
	
		
	


