package maccess;
import test.*;
public class DemoSealed {
	public static void main(String[] args) {
		System.out.println("--------- ob1 ----------");
		ClassB ob1=new ClassB();
		ob1.mA();
		ob1.mB();
		
		System.out.println("--------- ob2 ----------");
		ClassC ob2=new ClassC();
		ob2.mA();
		ob2.mC();
		
		System.out.println("--------- ob3 ----------");
		ClassF ob3=new ClassF();
		ob3.mA();
		ob3.mD();
		ob3.mF();

		System.out.println("--------- ob4 ----------");
		ClassE ob4=new ClassE();
		ob4.mE();
	}

}
