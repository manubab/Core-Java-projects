package test;

public interface Itest3  {
	public abstract void m11();

	public static void m12() {
		System.out.println("****Icame from ITest3*****");
	}
	
	private void m13() {
		System.out.println("****I am private Itest3*** ");

	}

	private static void m14() {
		System.out.println("****I am Private Static Itest3****");

	}
	public default void m15() {
		this.m13();
		Itest3.m14();
		
		System.out.println("**** Icame from ITest3 m3*****");
	}

}
