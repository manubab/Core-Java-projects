package test;
public abstract class AbClass {
	public abstract void m1();
	public void m2() {
		AbClass.m3();
		AbClass.m4();
		this.m5();
		System.out.println("**** concreate m2***");
	}
	static {
		System.out.println("**** abstract static block*****");
	}
	{
		System.out.println("**** abstract instance block*****");
	}
	public static void m3() {
		System.out.println("**** abstract static m3()******");
	}
	private static void m4() {
		System.out.println("**** abstract private concreate static m4 ****");
	}
	private void m5() {
		System.out.println("**** abstract private concreate m5 *****");
	}
	
		
	

}
