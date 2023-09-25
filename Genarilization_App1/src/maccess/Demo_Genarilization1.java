package maccess;
import test.*;

public class Demo_Genarilization1 {
	public static void main(String[] args) {
		
		// Generalization 
		PClass p=(PClass)new CClass();
		p.m1();
		p.m2();
		
		//Specialization
		CClass c=(CClass)new PClass();
		
		c.m1();
		c.m2();
		c.m3();
		
	
		
	}

}
