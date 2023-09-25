package Practice;
import java.util.*;
public class Demo extends Thread {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
		Demo.Demo1 ob=new Demo().new Demo1();
		try {
			currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob.m1();
			
	}
	class Demo1{
		void m1() {
			System.out.println("manu bgm");
			for(int i=0;i<=5;i++) {
				System.out.printf("*");
			}
		}
	}

}
