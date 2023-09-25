package test;

public interface ITest1 {
	public void m1(int a);
	@SuppressWarnings("unused")
	private void m2(int b) {
		System.out.println("*****private ITest1 m2(b)***");
		System.out.println("The value "+b);
	}
	private static void m3(int c) {
		System.out.println("****Private Itest1 m3(z)****");
		System.out.println("The value  :"+c);
	}
	public default void m4(int a,int b,int c,int d) {
		this.m2(b);
		ITest1.m3(c);
		System.out.println("****ITest1 m4()*****");
		System.out.println("The value :"+d);
	}
}
