package test;
import java.util.Scanner;
public class String_Class {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given String :");
		String s=sc.nextLine();
		int count=0;
		String sn="",r="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(Character.isUpperCase(c))
				r=r+Character.isLowerCase(c);
			else
				r=r+Character.isUpperCase(c);
		}
		System.out.println(r);
	}
	

}
