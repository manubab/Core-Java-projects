package maccess;
import java.util.*;
public class DemoException5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sleep time");
		int time=sc.nextInt();
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("val :"+i);
				Thread.sleep(time);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
