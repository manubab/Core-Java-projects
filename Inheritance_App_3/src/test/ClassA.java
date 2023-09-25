package test;

public class ClassA {
	public ClassA(int a) {
		System.out.println("=====Pclass con 1 ====== ");
		System.out.println("The value of a :"+a);
		
		System.out.println("\n-----------------------------------\n");
		
	}
	public ClassA(int a,int b) {
		this(a);
		System.out.println("===pclass con 2=====");
		System.out.println("The value of b :"+b);
		
		System.out.println("\n-----------------------------------\n");

	}

}
