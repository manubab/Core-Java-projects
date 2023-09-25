package maccess;

import test.*;

public class Demo_Lambda_2 {
	
	public static void main(String[] args) {
	ITest ob1= Access.add();
    ITest ob2= Access.sub();
	ITest ob3= Access.mul();
    ITest ob4= Access.div();
	ITest ob5= Access.modulo();
	
	ob1.cal(12, 21);
	ob2.cal(20, 10);
	ob3.cal(30, 9);
	ob4.cal(40, 5);	
	ob5.cal(20, 2);	
	}
	
	
}
