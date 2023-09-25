package test;

 // overloading methods

public class ClassA {
	public int z=1200;

	public void m() {
		System.out.println("I am instance method from parent class ");
	}
	public void m(Integer a) {
		int s=120;
		s=a;
		this.z=120;
		System.out.println("I am instance method from parent class "+a);
		this.m();
		System.out.println("I am instance method from parent class :"+s);
	}
	

}
