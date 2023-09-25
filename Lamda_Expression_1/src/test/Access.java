package test;

public class Access{
	public int a=100;
	public static int b=200;

	public static ITest getRef() {
		int c=300;
		return(a)-> {System.out.println("**** ITest m1(x) ****"+a);
		System.out.println("The value a"+a);
		System.out.println("The value b"+b);
		System.out.println("The value c"+c);
		
		
		};
	}

}
