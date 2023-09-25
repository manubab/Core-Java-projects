package test;
import java. util.*;
public class Test1 {
	
	public StringBuilder sb=null;
	public Test1(StringBuilder sb) {
		this.sb=sb;
		
	}
	
	public void writer(Scanner s) {
		System.out.println("Enter Number of Integer values :");
		int n=Integer.parseInt(s.nextLine());
		for(int i=1;i<=n;i++) {
			System.out.println("Enter "+ n+ " Numeber "+i);
			sb.append(s.nextLine()+":");
			System.out.println("Builder append Sucessfully ,");
			
			
			
			
		}
		
		
	}

}
