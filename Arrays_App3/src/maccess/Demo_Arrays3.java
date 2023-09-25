package maccess;

import java.util.*;
import test.Employee;

public class Demo_Arrays3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Employees : ");
		int n = Integer.parseInt(sc.nextLine());
		Employee[] ob = new Employee[n];
		System.out.println("\nEnter " + n + " Employee Details : ");
		for (int i = 0; i < ob.length; i++) {
			System.out.println("\nEnter " + (i + 1) + " Employee Details : ");
			ob[i] = new Employee();
			System.out.println("\nEnter Employee id :");
			ob[i].id = sc.nextLine();
			System.out.println("\nEnter Employee name :");
			ob[i].name = sc.nextLine();
			System.out.println("\nEnter Employee desg :");
			ob[i].desg = sc.nextLine();
			System.out.println("\nEnter Employee bsal :");
			ob[i].bsal = Integer.parseInt(sc.nextLine());
			ob[i].total = ob[i].bsal + (0.93f * ob[i].bsal) + (0.63f * ob[i].bsal);
			System.out.println("****Product details*****");
		}
		for (Employee k : ob) {
			System.out.println(k.toString());
		}
		System.out.println("**** Displaying Based on(Condition)****");
		System.out.println("Enter the Conditon sal :");
		int Csal = sc.nextInt();
		for (int i = 0; i < ob.length; i++) {
			ob[i] = new Employee();
			for (Employee k : ob) {
			if (ob[i].total >= Csal) {
				
					System.out.println(ob[i].toString());
				}
			}
		}

		sc.close();
	}

//	wap to read and display multiple products using Array
//	wap to read and display multiple book details using Array

}
