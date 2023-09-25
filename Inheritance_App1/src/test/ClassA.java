package test;
//    parent class
public class ClassA {
	public int a; // memory child Class object
	public static int b; //memory in the class 
	
	public void m1() {// memory in the Child Object...
		System.out.println("====Parent class Intance m1()=====");
		System.out.println("The instance variable value of a :"+ a);
		System.out.println("The static variable valueof b: "+ b);
	}
	public static void m11() { //memory in the Class
		System.out.println("====Parent class static m11()=====");
		//System.out.println("The instance variable value of a :"+ a);
		System.out.println("The static variable valueof b: "+ b);
	}

}
