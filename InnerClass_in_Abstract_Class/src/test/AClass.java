package test;
public abstract class AClass {
	public abstract void dis(int a); 
	public class Subclass1{
		public void m1(int a) {
			System.out.println("** SubClass m1() **");
			System.out.println("The value a :"+a);
		}
	}
	public static class SubClass2{
		public void m2(int a) {
			System.out.println("** SubClass m1() **");
			System.out.println("The value a :"+a);
		
			
		}
	}
}
