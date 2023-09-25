package maccess;
import test.*;
public class Demo_InnerClass_in_Interface {
	public static void main(String[] args) {
		
	
	ITest ob=new ITest() {
		
		public void m1(int a) {
			System.out.println("** m2(a) **");
			System.out.println("The value a:"+a);
			
		}
		
		
	};
	ob.m1(121);
	ITest.Subclass1 ob1=new ITest.Subclass1();
	ob1.m2(122);
	ITest.Subclass1.m22(123);
	
	
	}

}
