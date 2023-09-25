package maccess;
import test.*;
import java.util.*;
public class Demo_Inhe_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ClassB ob=new ClassB();
		System.out.print("Enter the the value of a :");
		ob.a=sc.nextInt();
		System.out.print("Enter the value of b :");
		ClassA.b=sc.nextInt();
		System.out.print("Enter the value of x :");
		ob.x=sc.nextInt();
		System.out.print("Enter the value of y :");
		ClassB.y=sc.nextInt();
		
		ob.m1();
		ClassA.m11();
		ob.m2();
		ClassB.m22();
		
		
		
		sc.close();
		
	

	}

}
