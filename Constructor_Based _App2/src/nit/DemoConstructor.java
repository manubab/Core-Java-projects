package nit;
import java.util.Scanner;
import test.CTest;
public class DemoConstructor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		CTest c=new CTest();
		System.out.println("Enter train no");
		c.setTrainNo(sc.nextInt());
		System.out.println("Enter train name");
		c.setTrainName(sc.next());
		System.out.println("Enter ticket price");
		c.setTicketPrice(sc.nextInt());
		System.out.println("display trian details");
		System.out.println("train no :"+ c.getTrainNo());
		System.out.println("train name :"+ c.getTrainName());
		System.out.println("ticket price:"+ c.getTicketPrice());
		sc.close();
	}

}
