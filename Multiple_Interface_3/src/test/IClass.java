package test;

public class IClass implements Itest1,Itest2,Itest3{

	@Override
	public void m1() {
		System.out.println("I came from first Interface :");
		
	}
	
	@Override
	public void m6() {
		System.out.println("I Came from Second Interface :");
		
	}
	
	@Override
	public void m11() {
		System.out.println("I Came from Third Interface :");
		
	}
	public static void main(String[] args) {
		IClass i=new IClass();
		
		i.m1();
		Itest1.m2();
		i.m5();
		i.m6();
		Itest2.m7();
		i.m10();
		i.m11();
		Itest3.m12();
		i.m15();
		
		
	}
	
	

	

	
	
	
	
	

	
	

}
