package test;

public interface ITest {
	
	private static void m2(int a) {
		System.out.println("=====private non-static m2(a)=====");
		System.out.println("The val :"+a);
		
	}
	private  void m1(int a) {
		System.out.println("====Private static m1(a)===");
		System.out.println("The value :"+a);
	}
	public  default void m3(int a,int b,int c) {
		ITest.m2(a);
		this.m1(a);
		
		
		
	}

}

