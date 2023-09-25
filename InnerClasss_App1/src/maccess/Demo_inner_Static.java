package maccess;
import test.*;
import test.SubClass_1.SubClass_2;
public class Demo_inner_Static {
	public static void main(String[] args) {
		SubClass_1 sb=new SubClass_1();
		sb.m1();
		SubClass_1.SubClass_2 sb2=new SubClass_1.SubClass_2();
		sb2.m2();
		SubClass_2.m22();
		
		
	}

}
