package maccess;

public class Demo_Wrapper_Class {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		System.out.println("\n***********using Wrapper Class Consturctor");

//		Boxing processing  Old version.......

		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer("123");
		Float ob3 = new Float(123.12f);
		Float ob4 = new Float(124.12);
		Float ob5 = new Float("125.12");
		System.out.println("\n******** data from objects********");
		System.out.println("ob1 : " + ob1.toString());
		System.out.println("ob2 : " + ob2.toString());
		System.out.println("ob3 : " + ob3.toString());
		System.out.println("ob4 : " + ob4.toString());
		System.out.println("ob5 : " + ob5.toString());
//       unBoxingProcess old version......
		int i1 = ob1.intValue();
		int i2 = ob2.intValue();
		float f1 = ob3.floatValue();
		double d2 = ob4.floatValue();
		float f3 = ob5.floatValue();
		System.out.println("\n ***** data from objects to primitive*******");
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		System.out.println("f1 : " + f1);
		System.out.println("d2 : " + d2);
		System.out.println("f3 : " + f3);

	}

}
