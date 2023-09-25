package maccess;

import maccess.A.C;

class A {
	void m1() {
		System.out.println("******i am class A m1()******");
	}

	static void m2() {
		System.out.println("******i am class A static m1()******");
	}

	interface B {
		void m1();

		static void m2() {
			System.out.println("****** interface static m2()****");
		}
	}

	class C implements B {

		public void m1() {
			System.out.println(" ***** inner interface m1()***** ");
			class D {
				void m1() {
					System.out.println("****The value m1()****");
					interface E{
						void e1();
					}
					
					class F implements E{

						public void e1() {
							System.out.println("**** The value e1 ****");
							
						}
						
						
					}
				}
				
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		A.m2();
		A.B b = a.new C();
		b.m1();
		
		
		
		
	}

}
