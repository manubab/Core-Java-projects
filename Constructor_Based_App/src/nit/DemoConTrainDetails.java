package nit;

//wap to read and display train details
//Train No,Train Name,Departure time,arrived time,from station,to station,ticket price;



import java.util.Scanner;

import test.Display_TrainDeatils;

public class DemoConTrainDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Train Number");
		int a=Integer.parseInt(s.nextLine());
		System.out.println("Enter Train Name");
		String b=s.nextLine();
		System.out.println("Enter Train Departure Time");
		String c=s.nextLine();
		System.out.println("Enter Train Delay Time");
		String d=s.nextLine();
		System.out.println("Enter Train Arraived Time");
		String e=s.nextLine();
		System.out.println("Enter From Station ");
		String f=s.nextLine();
		System.out.println("Enter To Station");
		String g=s.nextLine();
		System.out.println("Enter Ticket Price");
		int h=s.nextInt();
		Display_TrainDeatils dt=new Display_TrainDeatils(a, b, c, d, e, f, g, h);
		//dt.getTrainDetails();
		
	}

}
