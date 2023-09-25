package test;

public interface Itest2 {
	public abstract void m6();

	public static void m7() {
		System.out.println("****Icame from ITest2*****");
	}
	private void m8() {
		System.out.println("****I am private Itest2*** ");
	}
    private	static  void m9() {
		System.out.println("****I am Private Static Itest2****");
	}
    public default void m10() {
		this.m8();
		Itest2.m9();
		System.out.println("**** Icame from ITest2 m3*****");
	}

}
