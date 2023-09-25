package com.manu.sw;

interface ITest {
	public abstract void dis1(int k);

	public default void dis2(int z) {
		System.out.println("*** ITest dafault :dis2(z)");
		System.out.println("The value : " + z);

	}
}

class Display {
	public Display(int a) {

	}

	public void m1(int b) {
		System.out.println("**** instance method body ****");
		System.out.println("The value b:" + b);
	}

	public static void m2(int c) {
		System.out.println("*** Static method body ****");
		System.out.println("The value c :" + c);
	}
}

public class Demo {
	public static void main(String[] args) {
		System.out.println("---Reference to Constuctor----");
		ITest ob = Display::new;
		ob.dis1(12);
		ob.dis2(13);

		System.out.println("----Reference of Instace method-----");
		Display d = new Display(121);
		ITest ob1 = d::m1;
		ob1.dis1(12);
		ob1.dis2(13);

		System.out.println("---- Reference Static Body ----");
		ITest ob2 = Display::m2;
		ob2.dis2(133);
	}

}
