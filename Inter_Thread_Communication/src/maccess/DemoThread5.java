package maccess;
import test.*;
public class DemoThread5 {
	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t2.start();
		t1.start();
	
	}

}
