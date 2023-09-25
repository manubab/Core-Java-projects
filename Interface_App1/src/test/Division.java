package test;

public class Division implements IClaculate{

	@Override
	public void calculate(int a, int b, int c) {
		c=a/b;
		System.out.println("Division :"+c);
		
	}

}
