package test;

public class ClassB extends ClassA{
	
	public void m(int a) {
		System.out.println("I am instance method from child class "+a);
	}
	public void m(int a,String b) {
		System.out.println("I am instance method from child class :"+b);
		this.m(a);
		super.m(120);
		
	}


}
