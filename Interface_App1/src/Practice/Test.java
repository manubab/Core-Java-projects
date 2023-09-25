package Practice;

interface A1{
	int a=20;
	static void m1(int a) {
		
	}
	default void m1(String z) {
		System.out.println("String :"+z);
		A1.m1(a);
		A1.m1();
		this.m1('v');
		
	}
	private void m1(char c) {
		
	}
	private static int m1() {
		
		return 12;
		
	}
	
}
public class Test implements A1 {

	public static void main(String[] args) {
		Test ob=new Test();
		ob.m1("amma");
	
	}

}
