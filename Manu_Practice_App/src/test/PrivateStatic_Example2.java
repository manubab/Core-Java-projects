package test;

interface My_in{
	public abstract void My_in();
	
}
interface MyOther_in{
	void MyOther_in();
}

public class PrivateStatic_Example2 implements My_in,MyOther_in {

	@Override
	public void MyOther_in() {
		System.out.println("My Other text...!");
	}

	@Override
	public void My_in() {
		System.out.println("My text.....!");
		
	}
	public static void main(String[] args) {
		
		My_in ps2=new PrivateStatic_Example2();
		ps2.My_in();
		MyOther_in ps3=new PrivateStatic_Example2();
		ps3.MyOther_in();
		
	}
	

}
