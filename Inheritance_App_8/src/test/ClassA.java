package test;
///   over loading
public class ClassA {
	public void m(int a) {
		System.out.println("The value of a :"+a);
	}
	public void m(int a,int b) {
		this.m(a);
		System.out.println("The value of :"+b);
		
	}

}
