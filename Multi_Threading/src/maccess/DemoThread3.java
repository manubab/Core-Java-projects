package maccess;
import p2.Selection;
import p2.User1;
import p2.User2;
import test.*;
public class DemoThread3 {
	public static void main(String[] args)
	{
		Selection s=new Selection();
		User1 u1=new User1(s);
		User2 u2=new User2(s);
		
		Thread t1=new Thread(u1);
		Thread t2=new Thread(u2);
		
		t1.start();
		t2.start();
	}

}
