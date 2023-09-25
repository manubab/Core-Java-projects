package test;

public sealed class ClassC implements Itest permits ClassD{

	@Override
	public void m() {
		System.out.println("** ClassC m() **");
	}

}
