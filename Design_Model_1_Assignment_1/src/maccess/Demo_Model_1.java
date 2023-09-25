package maccess;
import test.*;
import java.util.*;
public class Demo_Model_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value -1 :");
		int v1=sc.nextInt();
		System.out.println("Enter value -2 :");
		int v2=sc.nextInt();
		
		System.out.println("==Choice===");
		System.out.println("\t1.Greater value :"+"\n2.Smaller_value");
		
		switch(sc.nextInt()) {
		case 1:
			ITest ob=Access.gv();
			System.out.println("Greater_value :"+ob.compare(v1, v2));
			break;
		case 2:
			ITest ob1=Access.sv();
			System.out.println("Greater_value :"+ob1.compare(v1, v2));
			break;
		default:
			System.out.println("invalid choice...!");
			
		}
	}

}
