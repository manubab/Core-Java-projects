package maccess;
import test.*;
public  class Demo_Inheritance implements Itest3{

	public void m1(int a) {
		System.out.println("***ITest1 m1(a)****");
		System.out.println("The value  :"+a);
	}
	public void m5(int p) {
		System.out.println("*****ITest2 m5(p)*****");
		System.out.println("The value :"+p);
		
		
	}
	public void m9(int x) {
		System.out.println("*****ITest3 m9(x)*****");
		System.out.println("The value :"+x);
	
	}
	public static void main(String[] args) { 
		Demo_Inheritance di=new Demo_Inheritance();
		di.m1(12);
		di.m4(12, 13, 14, 15);
		
		di.m5(31);
		di.m8(22, 23, 24, 25);
		
		di.m9(44);
		di.m12(35, 36, 37, 38);
		
		
	}
	

}
