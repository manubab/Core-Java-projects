package test;

public class SubClass1 {
	public int a=10;
	public static int b=20;
	
	public void m1() {
		class M1Sub{
			public void m1() {
				System.out.println("**** M1Sub m1()****");
				System.out.println("The value :"+a);
				System.out.println("The value :"+b);
				
			}
			public static void m2() {
				System.out.println(" ****M1Sub m2()***** ");
//				System.out.println("The value :"+a);
				System.out.println("The value :"+b);
			}
			
			
		}
		M1Sub m=new M1Sub();
		m.m1();
		m.m2();

	}
	

}
