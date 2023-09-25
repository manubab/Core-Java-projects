package maccess;
import java.util.*;
import test.*;

public class Demo_Interface_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value -1 :");
		int v1=sc.nextInt();
		System.out.println("enter value -2 :");
		int v2=sc.nextInt();
		
		System.out.println("===choice===");
		
		System.out.println("\t1.GraterValue"+"\n\t2.SmallerValue");
		System.out.println("Enter your choice ....");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			Greater_Value gv=new Greater_Value();
			int a=gv.cal(v1, v2);
			System.out.println("Grater value :"+a);
			break;
		case 2:
			Smaller_Class s=new Smaller_Class();
			int c=s.cal(v1, v2);
			System.out.println("Smaller value :"+c);
			break;
		default:
			System.out.println("Invalid choice....");
		
		}
		
		
	}
	
}
