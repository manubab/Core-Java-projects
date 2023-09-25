package maccess;
import java.util.*;


//write a program to read a String and display only unique charaters from the
//String



public class Demo_String7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		int len=str.length();
		
		int n=0;
		for(int i=0;i<=len-1;i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int b=Integer.parseInt(String.valueOf(ch));
				n=n+b;
				
				
			}
		}
		System.out.println("sum of digits :"+n);
		
	}

}
