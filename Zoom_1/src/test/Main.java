package test;
class ClassA {
	public void m1() {
		System.out.println("inside A m1() ");
	}

	public void m1(int a) {
		System.out.println("inside A integer ");
	}
}
class ClassB extends ClassA {
	
	public void m1() {
		
		System.out.println("inside B");
	}
	public void m1(int a) {
		System.out.println("inside B integer"+a);
	}
	
}
public class Main {
	public static void main(String[] args) {
		ClassB a = new ClassB();
		a.m1(12);
		
	}
}





