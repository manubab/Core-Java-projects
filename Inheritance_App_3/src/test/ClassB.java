package test;

public class ClassB extends ClassA {

	public ClassB(int a,int b,int c,int d) {
		this(a,b,c);
		
		System.out.println("====Cclass Con 1= =====");
		System.out.println("The value of d :"+d);
		
		
		System.out.println("\n-----------------------------------\n");

	}
	public ClassB(int a,int b,int c) {
		
		super(a,b);
		System.out.println("===Cclass con 2====");
		System.out.println("The value of c :"+c);
		
		System.out.println("\n-----------------------------------\n");

	}
	
	

}
