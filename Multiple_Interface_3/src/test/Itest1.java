package test;
public interface Itest1 {
	public abstract void m1();

	public static void m2() {
		System.out.println("****Icame from ITest1*****");
	}

	
	private void m3() {
		System.out.println("****I am private Itest1*** ");
	}
	 private static void m4() {
		System.out.println("****I am Private Static Itest1****");

	}
	 public default void m5() {
			Itest1.m4();
			this.m3();
			
			System.out.println("**** Icame from ITest1 m3*****");
		}

}
