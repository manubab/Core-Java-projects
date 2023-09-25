package maccess;
import test.*;
public class Demo_Annony_1 {
	public static void main(String[] args) {
		
		SubClass1 ob=new SubClass1() {
			public void m1(int x) {
				System.out.println("****** Anony1(x) *****");
				System.out.println("The value x:"+ x+"a");
				
				
			}
			public static void m2(int y) {
				System.out.println("***** annony2(y) *****");
				System.out.println("The value y:"+y);
			}
			
		} ;
		ob.m1(12);
	
	
		
	}

}
