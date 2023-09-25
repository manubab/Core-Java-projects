package test;

public class ClassB extends ClassA{
	public int x;//memory in the child object
	public static int y;// memory in the class
	
	public void m2() { //memory in the Child Object
		System.out.println("====The child Class Intance m2()=====");
		System.out.println("The intance variable value of x :"+x);
		System.out.println("The static variable value of y :"+y);
	}
	public static void m22() {// memory in the class
		System.out.println("======The child Class Static m22()======");
	//	System.out.println("The instance variable value of x :"+x);
		System.out.println("The static variable value of y :"+y);
	}
	

}
