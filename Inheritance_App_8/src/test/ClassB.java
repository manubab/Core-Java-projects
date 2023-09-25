package test;

public class ClassB extends ClassA {
	public int m(int a,int b,int c) {
		super.m(a, b);
		System.out.println("The value of c :"+c);
		return a;
	}
	public void m(int a,int b,int c,int d) {
		this.m(a, b, c);
		System.out.println("The value of d :"+d);
		
	}

}
