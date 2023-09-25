package test;
public class Access {
	public void m1(int a) {
		System.out.println("*** m1() ***");
		System.out.println("The value a :"+a);
	}
	public Access(int b){
		System.out.println("** Constructer **");
		System.out.println("The value of b :"+b);
	}
	public static void m2(int a) {
		System.out.println("*** Static void ***");
		System.out.println("The value b:"+a);
	}

}
