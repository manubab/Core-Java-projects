package maccess;

public class DemoWrapperClass2 {

	public static void main(String[] args) {

//		AutoBoxing Process.....

		Integer ob1 = 12;
		Float ob2 = 12.23f;

		System.out.println("****diaplying AutoBoxing Data****");

		System.out.println("ob1 : " + ob1.toString());
		System.out.println("ob2 : " + ob2.toString());

//		 Auto UnBoxing process..... 
		int i1 = ob1;
		float f1 = ob2;

		System.out.println("****diaplying AutoUnBoxing Data****");

		System.out.println("i1 : " + i1);
		System.out.println("f1 : " + f1);

	}

}
