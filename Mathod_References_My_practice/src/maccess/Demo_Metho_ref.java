package maccess;

import test.Sayable;
import test.Method_ref1;

public class Demo_Metho_ref {
	public static void main(String[] args) {
		
		System.out.println("---------------------------------");
		

		
		Sayable s=Method_ref1::new;
		
		Sayable s1=Method_ref1::m2;
		s1.say();
		Method_ref1 ob1=new Method_ref1();

	Sayable s2=ob1::m1;
	s2.say();
	
		
	}

}
