package maccsess;
import test.*;
import java.util.*;
public class Demo_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the branch :");
		String b=sc.nextLine();
		System.out.println("Enter the roll no :");
		String r=sc.nextLine();
		Test t=new Test();
		Test1 t1=new Test1();
		boolean  b1=t.vest(b);
		boolean r1=t1.validRollNo(r);
		boolean b3=t.equals(t1);
		if(r1) {
			System.out.println("valid :  "+b+r);
		}else {
			System.out.println("invalid");
		}
		sc.close();
	}
}
		
	



































/*
 * if(b.equals(r)) {
 * 
 * System.out.println("Branch and roll no are valid ");
 * System.out.println("branch :"+b); System.out.println("roll no"+r); }else {
 * System.out.println("invalid"); }
 */
