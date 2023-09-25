package maccess;
import test.*;
import java.util.*;
public class Demo_Model_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value -1:");
		int v1=sc.nextInt();
		
		System.out.println("Enter value -2:");
		int v2=sc.nextInt();
		
		System.out.println("======choice======");
		System.out.println("\t1.Greater_Value :"+"\n2.Smaller_Value :");
		System.out.println("Enter choice :");
		
		switch(sc.nextInt()) {
		case 1:
			ITest ob1=new ITest() {

				@Override
				public int compare(int a, int b) {
					if(a>b) {
						return a;
						
					}else {
						return b;
					}
					
				}
				
			};
		int r1=	ob1.compare(v1, v2);
		System.out.println("Grater_value :"+r1);
			break;
		case 2:
			ITest ob2=new ITest() {

				@Override
				public int compare(int a, int b) {
					if(a<b) {
						return a;
						
					}else {
						return b;
					}
					
				}
				
			};
		int r2=	ob2.compare(v1, v2);
		System.out.println("Grater_value :"+r2);
			break;
			default:
				System.out.println("invalid choice ...!");
			
		}
	}

}
