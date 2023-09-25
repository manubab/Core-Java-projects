package test;

public interface Itest2 extends ITest1 {
	public void m5(int p);
	
	
	private void m6(int q) {
		System.out.println("**** ITest2 m6(q)*****");
		System.out.println("The value :"+q);
	}
	private static void m7(int r) {
		System.out.println("**** ITest2 m7(r)*****");
		System.out.println("The value :"+r);
	}
	public default void m8(int p,int q,int r,int s) {
		
		System.out.println("**** ITest2 m7(s)*****");
		System.out.println("The value :"+s);
		this.m6(q);
		Itest2.m7(r);
		
	}

}
