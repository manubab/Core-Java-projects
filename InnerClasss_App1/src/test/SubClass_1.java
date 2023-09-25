package test;
public class SubClass_1 {
	public int a=10;
    public static int b=20;	
	public void m1() {
		System.out.println("******SubClass m1()*******");
		System.out.println("The value a"+a);
		System.out.println("The value b"+b);
	}
	public static class SubClass_2{
		public int x=100;
		public static int  y=200;
		
		public void m2() {
			System.out.println("***** SubClass **** ");
//			System.out.println("The value a"+a);
			System.out.println("The value b"+b);
			System.out.println("The value x"+x);
			System.out.println("The value y"+y);
		}
		public static void m22() {
			System.out.println("***** SubClass m22()**** ");
//			System.out.println("The value a"+a);
			System.out.println("The value b"+b);
//			System.out.println("The value x"+x);
			System.out.println("The value y"+y);
			
		}
	}
	

}
