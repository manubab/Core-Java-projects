package Practice;
class S{
	public static int a=20;
	static int b=30;
	static void m1() {
		a=40;
		b=50;
		System.out.println("value of a"+a);
		System.out.println("value if b"+ b);
		
		
	}
	public static void main(String[] args) {
		S s=new S();
		
		s.m2();
		S.m1();
		
	
	}
	void m2()
	{
	int c=654;
		a=60;
		b=30;
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		System.out.println(c);
		
	}

}
public class A{
	
}
