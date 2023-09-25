package inheriatnce;

class Parent {

	 String m1() {
		return "I am private m1() from parent";
	}

}

public class Child extends Parent {
	 String m1() {
		return "baby";
	}

	public static void main(String[] args) {
		Child c = new Child();

		System.out.println(c.m1());
	}

}
