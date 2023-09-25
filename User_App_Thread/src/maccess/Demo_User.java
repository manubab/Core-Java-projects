   package maccess;
import test.*;
public class Demo_User {

	public static void main(String[] args) {
		Registraction ob1=new Registraction();
		Login ob2=new Login();
		
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		
		t1.start();
		t2.start();
		
		
		

	}

}
