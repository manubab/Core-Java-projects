package test;
interface I1{
	public abstract void printStatments();
	
	public default void printDefault() {
		this.method4();
		I1.method3();
		
		System.out.println("java statemnets ....!");
	}

	private void method4() {
		
		System.out.println("Private non static .....!");
	}

	private static void method3() {
		System.out.println("== private stataic m3() interface....!");
	}
}
public class PrivateStatic_Example1 implements I1{

	public  void printStatments() {
		System.out.println("Writing Lamda Expresssoins in java....");
	}
	public static void main(String[] args) {
		PrivateStatic_Example1 i1= new PrivateStatic_Example1();
		i1.printDefault();
	}

}
