package test;

public class Access {
	public static ITest add() {
		return (a,b)->{
			System.out.println("Addition :"+(a+b));
		
		
		};
	}
	public static ITest sub() {
		return (a,b)->System.out.println("Substraction :"+(a-b));
	}
	public static ITest mul() {
		return (a,b)->System.out.println("Multiplication:"+(a*b));
	}
	public static ITest div() {
		return (a,b)->System.out.println("division :"+(a/b));
	}
	public static ITest modulo() {
		return (a,b)->System.out.println("Modulo Division :"+(a%b));
	}

}
