package test;

public class Multilication  implements IClaculate{

	@Override
	public void calculate(int a, int b, int c) {
		c=a*b;
		System.out.println("Multiplication : "+c);
		
	}

}
