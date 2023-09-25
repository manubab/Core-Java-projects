package test;

public class ModuloDevision implements IClaculate{

	@Override
	public void calculate(int a, int b, int c) {
		c=a%b;
		System.out.println("Modulo Division :"+c);
		
	}

}
