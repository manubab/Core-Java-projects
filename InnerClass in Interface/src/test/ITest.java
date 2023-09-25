package test;
public interface ITest {
	
	public void m1(int a);
	
	
	public  class Subclass1{
		public void m2(int a) {
			System.out.println("** m2(a) **");
			System.out.println("The value a:"+a);
			
		}
		public static void m22(int a) {
			
			System.out.println("** m22(a) **");
			System.out.println("The value a:"+a);
			
			
		}
	}
	

}
