package test;

public interface Itest3 extends Itest2 {
	public void m9(int x);
	
	private void m10(int y) {
		System.out.println(" **** ITest3 m10(y)***** ");
		System.out.println("The value :"+y);
	}
	private static void m11(int z) {
		System.out.println(" **** ITest3 m10(z)***** ");
		System.out.println("The value :"+z);
		
	}
	public default void m12(int x,int y,int z,int l) {
		this.m9(y);
		Itest3.m11(z);
		System.out.println(" **** ITest3 m10(l)***** ");
		System.out.println("The value :"+l);
		
	}

}
