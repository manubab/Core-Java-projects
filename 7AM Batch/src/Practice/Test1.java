package Practice;
import java.util.*;
public class Test1 {
	public void m1(int a,int b) {
		System.out.println("Add :"+(a+b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=sc.nextInt();
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		
		Test1 ob=new Test1();
		ob.m1(a, b);
	}

}
