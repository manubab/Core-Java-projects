package maccess;
import test.*;
public class Demo_Sealed2 {
	public static void main(String[] args) {
		System.out.println("--------------ob1---------------");
		ClassA ob1=new ClassA();
		ob1.m();
		System.out.println("--------------ob2---------------");
		ClassB ob2=new ClassB();
		ob2.m();
		System.out.println("--------------ob3---------------");
		ClassD ob3=new ClassD();
		ob3.m();
		ob3.mE();

	}

}
