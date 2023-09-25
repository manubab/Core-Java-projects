package test;
public class HelloEveryone {
	public abstract class Alt{
		public abstract void m1(int a);
		public void sayHello() {
			System.out.println("a");
		}
		
	}
	public static abstract class Abcs1{
		public abstract void abcs1(int a);
		public void m1(int a) {
			System.out.println("*** The static abstract m1() ***");
			System.out.println("The value a :"+ a);
		}
	}

}
