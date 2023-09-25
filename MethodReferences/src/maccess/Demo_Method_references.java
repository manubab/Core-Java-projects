package maccess;
import test.*;
public class Demo_Method_references {
	public static void main(String[] args) {
		Access a=new Access(12);
		ITest ob1=Access::new;
		ob1.m1(121);
		ITest ob2=Access::m2;
		ob2.m1(121);

	}

}
