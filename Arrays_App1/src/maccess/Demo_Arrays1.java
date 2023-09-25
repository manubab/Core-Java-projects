package maccess;

import java.util.Scanner;

public class Demo_Arrays1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		Integer arr[]=new Integer[n];
//		Adding data into Array.....
		System.out.println("Enter "+ n + " Elements into Array : ");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=new Integer(sc.nextInt());// adding data into Array
			
		}
		System.out.println("Displaying Array Elements .....");
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i].toString());
		}
		
		for(int k: arr) {
			System.out.println(k);
		}
		
		sc.close();
	}

}
