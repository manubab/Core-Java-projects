package test;

public class IClass extends AClass implements ITest {

	@Override
	public void m1() {
		System.out.println("***ITest m1()****");
	}

	@Override
	public void m2() {
		System.out.println("***AClass m2()*****");
		
	}
	public void m3() {
		System.out.println("****IClass m3()****");
	}

}
