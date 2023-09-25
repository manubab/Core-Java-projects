package nit;
import java.util.*;
import test.GreaterVaule;
import test.SmallerValue;
public class CampareingDemo{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value -1");
		int a=sc.nextInt();
		System.out.println("Enter values -2");
		int b=sc.nextInt();
		System.out.println("Enter value -3");
		int c=sc.nextInt();		
		System.out.println("========choice=======");
		System.out.println("1.Greter value\n2.SmallerValue");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			GreaterVaule gv=new GreaterVaule();
			int r1=gv.gretar(a, b, c);
			System.out.println(r1);
		   
			break;
			
		case 2:
			SmallerValue sv=new SmallerValue();
			int r2=sv.smaller(a, b, c);
			System.out.println(r2);
			break;
		
		}	
		
	}
}