package test;
import java.util.*;

public class Writer {
	public StringBuffer sb=null;
	
	public Writer(StringBuffer sb) {
		this.sb=sb;
		
	}
	public void write(Scanner s) {
		System.out.println("Enter number of String :");
		int n=Integer.parseInt(s.nextLine());
		System.out.println("Enter "+ n +" Number of String :");
		for(int i=0;i<=n;i++) {
			System.out.println("Enter the "+i+"String :");
			sb.append( s.nextLine()+" :");
			System.out.println("String Append Succesfully ");
			
		}
	}

}
