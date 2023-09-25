package test;

public class Class_1 extends AbClass{
	public void m1() {
		System.out.println("**** abstract method m1() override *****");
	}
	public void m2() {
		Class_1.m3();
		Class_1.m4();
		this.m5();
		
		System.out.println("**** extends concreate m2()***");
	}
	static {
		System.out.println("**** extends  static block*****");
	}
	{
		System.out.println("**** extends instance block*****");
	}
	public static void m3() {
		System.out.println("**** extends static m3()******");
	}
	private static void m4() {
		System.out.println("**** extends  private  static concreate m4 ****");
	}
	private void m5() {
		System.out.println("**** extends private concreate m5 *****");
	}
	
		

}
