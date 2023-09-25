package maccess;
import java.util.*;
public class Demo_Exception1 extends Exception  {
	public Demo_Exception1(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter bsal");
		int bsal=sc.nextInt();
		if(bsal<12000) {
			
			Demo_Exception1 dm=new Demo_Exception1("bsal always >12000/-");
			throw dm;
		}
		float totsal=bsal+((0.93F*bsal)+(0.63F*bsal));
		System.out.println("bsal :"+bsal);
		System.out.println("totsal :"+totsal);
		}
		catch(InputMismatchException ime) {
			System.out.println("invalid input ....Enter integer value");
			System.out.println("Name of the class"+ime);
		}
		catch(Demo_Exception1 dm) {
			System.out.println(dm.getMessage());
			System.out.println(dm.toString());
		}
		
		finally {
			sc.close();
		}
	}
}
