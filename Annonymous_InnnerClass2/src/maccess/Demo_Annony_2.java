package maccess;
import test.*;

public class Demo_Annony_2 {
	public static void main(String[] args) {
		Itest t1=new Itest() {

			@Override
			public void m1(int a) {
				System.out.println("***** interface anstract (m1)a*******");
				System.out.println("the value a :"+a);
						
				
			}
			
		};
		t1.m1(12);
		t1.m2(123);
	}

}
