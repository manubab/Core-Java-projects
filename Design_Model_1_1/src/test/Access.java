package test;

public class Access {
	
	public static ITest getRef() {
		return new ITest() {
			@Override
			public void getRef(int x) {
				System.out.println("**** ITest access(x) ****");
				System.out.println("The value x :"+x);
			}
		};
	}
}

