package test;

@FunctionalInterface

interface A {
	public abstract void m1();

}

@FunctionalInterface
interface B {
	public void m2(int a);

}

public class Test1 {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public void m1() {
				System.out.println("=====m1()===");
			}
		};
		a1.m1();
		A a2 = () -> System.out.println("m1()---anonymus ---");
		a2.m1();
		System.out.println("==Secend one===");
		B b1 = new B() {
			@Override
			public void m2(int a) {
				System.out.println("The value :" + a);

			}

		};
		b1.m2(12);
		B b2 = a -> System.out.println("The value :" + a);
		b2.m2(123);

	}

}
