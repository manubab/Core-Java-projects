package maccess;
import test.*;


public class Demo_InnerInterfaces {
	public static void main(String[] args) {
		System.out.println("----------- interfaces in class -----------");
	
		Subclass.I1 ob1=(int a)->System.out.println("the value a :"+a);
		Subclass.I2 ob2=(int a)->System.out.println("the value a :"+a);
		ob1.m1(12);
		ob2.m2(13);
		
		Interface.ii1 ob3=(int a)->System.out.println("the value a :"+a);
		ob3.iim1(14);
	
		AClass.Abi1 ob4=(int a)->System.out.println("The value a :"+a);
		
		ob4.abim1(15);
		
		AClass.Abi2 ob5=(int a)->System.out.println("the value a :"+a);
		
		ob5.abim2(16);
	
		
		

	}

}
