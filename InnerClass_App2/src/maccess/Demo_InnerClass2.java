package maccess;
import test.*;

public class Demo_InnerClass2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SubClass1 ob=new SubClass1();
		ob.m1();
		SubClass1.SubClass2 ob2=ob.new SubClass2();
		ob2.m2();
		ob2.m3();
		
	}

}
