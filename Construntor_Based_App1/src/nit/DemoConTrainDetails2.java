package nit;

import java.util.Scanner;

import test.DisplayTrainDetails;
public class DemoConTrainDetails2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the trina num");
		int a=sc.nextInt();
		System.out.println("Enter train name");
		String b=sc.nextLine();sc.nextLine();
		System.out.println("Enter train start time");
		String c=sc.nextLine();
		System.out.println("Enter jurney delay time");
		String d=sc.nextLine();
		System.out.println("Enter end time");
		String e=sc.nextLine();
		System.out.println("Enter from station");
		String f=sc.nextLine();
		System.out.println("Enter to station");
		String g=sc.nextLine();
		System.out.println("Enter ticket price");
		int h=sc.nextInt();
		
		DisplayTrainDetails dt=new DisplayTrainDetails(a,b,c,d,e,f,g, h);
		dt.getTrainDetails();
		sc.close();
	}

	
	

}
