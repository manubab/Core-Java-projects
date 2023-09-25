package p1;
import java.util.*;
public class DemoThread1 {
	public static void main(String[] args) {
		new Thread(()->System.out.println("Manu God")).start();
		
		new Thread(()->System.out.println("Madhu it Developer"+Thread.MAX_PRIORITY)).start();;
		
	
	}

}
