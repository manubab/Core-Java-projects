package maccess;

import test.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     EmpCurd ob=new EmpCurd("Manu.txt");
     
     ob.generateJavaFile("EmployeeExample.java");
		while (true) {
			System.out.println("Enter the choice :" + 
		                        "\n\t1.writeData" + 
					            "\n\t2.readData" + 
		                        "\n\t3.deleteData"+
					            "\n\t4.updateData" +
		                        "\n\t5.SortDataBy id" +
					            "\n\t6.exitApp" + 
		                        "\nEnter choice : ");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter the id");
				String id=sc.nextLine();
				System.out.println("Enter the name");
				String name=sc.nextLine();
				System.out.println("Enter the desg");
				String desg=sc.nextLine();
				System.out.println("Enter the sal");
				double sal=Double.parseDouble(sc.nextLine());
				Employee e=new Employee(id,name,desg,sal);
				ob.addEmployee(e);
				break;
			case 2:
				ob.displayEmployees();
				break;
			case 3:
				System.out.println("Enter the id");
				ob.deleteEmployee(sc.nextLine());
				break;
			case 5:
				ob.sortEmployeesById();
				break;
			case 4:
				System.out.println("Enter the id");
				String eid=sc.nextLine();
				System.out.println("Enter the name");
				String ename=sc.nextLine();
				System.out.println("Enter the desg");
				String edesg=sc.nextLine();
				System.out.println("Enter the sal");
				double esal=Double.parseDouble(sc.nextLine());
				ob.updateEmployee(eid, ename, edesg, esal);
				break;
			case 6:
				System.out.println("Application stopped...!");
				System.exit(0);
				break;
				default:
				System.out.println("invalid choice....!");
					
			
			}

		}
	}
}
