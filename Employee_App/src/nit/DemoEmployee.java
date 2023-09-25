package nit;
import java.util.Scanner;

import test.EmployeeSalary;
public class DemoEmployee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sal");
		int sal=s.nextInt();
		if(sal>=12000) {
			EmployeeSalary em=new EmployeeSalary();
					float totalsal=em.total(sal);
					System.out.println(totalsal);
		}else {
			System.out.println("invalid sal");
		}
		
	}
}
	
