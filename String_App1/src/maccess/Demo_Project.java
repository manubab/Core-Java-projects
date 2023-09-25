package maccess;
import java.util.Scanner;

import test.Branches;
public class Demo_Project {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Branch :");
		String s=sc.nextLine();
		int len=s.length();
		
		if(len==10) {
		String sub=s.substring(6,8);
		Branches b=new Branches();
	    String s1=	b.verifyBranch(s);
	    if(s1==null) {
	    	System.out.println("branch holding invalid input");
	    	
	    }else {
	    	System.out.println("Brcode : "+s);
	    	System.out.println("branch : "+s1);
	    }
	    	
	    }
		 
	}

}
