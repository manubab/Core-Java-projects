package p3;

import p4.User1;
import p4.*;

public class DemoThread {
	
	public static void main(String[] args) {
		
	
	
	User1 u1=new User1();
	User2 u2=new User2();
	
	Thread t1=new Thread(u1);
	Thread t2=new Thread(u2);
	
	
	
	t1.start();
	t2.start();
	
	}
	
	

}
