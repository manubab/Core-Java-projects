package test;
import java.util.Scanner;
public class String_Binary_Number_Additons {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Binary number :");
		String x=s.nextLine();
		
		System.out.println("Enter second Binary number :");
		String y=s.nextLine();
		
		int n1=Integer.parseInt(x, 2);
		int n2=Integer.parseInt(y, 2);
		int n3=n1+n2;
		
		System.out.println("n1"+Integer.toBinaryString(n1));
		System.out.println("n2"+Integer.toBinaryString(n2));
		System.out.println("n3=n1+n2 "+Integer.toBinaryString(n3));
	}

}
