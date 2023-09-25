package test;
public class SubClass1 {
	public int a=10;
	public static int b=20;
	
	public void m1() {
		System.out.println(" ******* OuterClass m1()*******");
	    System.out.println("The value a:"+a);
	    System.out.println("The value b:"+b);
	    }
	
	public class SubClass2{
		public int x=100;
		public static int y=200;
		
		public void m2() {
			System.out.println("**** innerClass m2()******");
			System.out.println("The value a:"+a);
			System.out.println("The value a:"+b);
			System.out.println("The value x:"+x);
			System.out.println("The value y:"+y);
			
		}
		
		public static void m3() {
			System.out.println("****** innerClass m3()*******");
//			System.out.println("The value a:"+a);
			System.out.println("The value a:"+b);
//			System.out.println("The value x:"+x);
			System.out.println("The value y:"+y);
			
		}
		
		
	}// inner class end

}//outer class end
