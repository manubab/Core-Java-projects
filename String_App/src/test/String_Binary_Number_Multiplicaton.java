package test;
import java.util.Scanner;
public class String_Binary_Number_Multiplicaton {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  first Binary :");
		String x=s.next();
		System.out.println("Enter the second Binary :");
		String y=s.next();
		
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		int n3=n1*n2;
		
		System.out.println("n1 "+Integer.toBinaryString(n1));
		System.out.println("n2 "+Integer.toBinaryString(n2));
		System.out.println("n3 =>"+Integer.toBinaryString(n3));

		
		
		
		s.close();
		
	}

}
