package macces;
import test.*;
public class Demo_Genalization_2 {
	public static void main(String[] args) {
		ITest t=(ITest)new IClass();
		t.m1();
		AClass a=(AClass)new IClass();
		a.m2();
		
		
		IClass i=new IClass();
		i.m1();
		i.m2();
		i.m3();
	}
}
