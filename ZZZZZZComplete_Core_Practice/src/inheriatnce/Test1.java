package inheriatnce;

public class Test1 {
	public void m2(Double n) {

		System.out.println(" i am parent m2 () Integer ");
	}

	public void m2(Object o) {
		System.out.println("i am parent m2 () with Object  ");
	}

	public void m2(String string) {
		System.out.println("i am parent m2 () with String  ");
	}

	public static void main(String[] args) {

		Test1 p = new Test1();

		p.m2(new Double(890.0));
	}

}
