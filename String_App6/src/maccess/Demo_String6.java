package maccess;

import java.util.Scanner;
import test.*;

public class Demo_String6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollno : ");
		String rollno=sc.nextLine();
		
		int len=rollno.length();
		if(len==10) {
			String brcode=rollno.substring(6, 8);
			GenarateBranch gb=new GenarateBranch();
			String branch=gb.genarate(brcode);
			if(branch==null) {
				System.out.println("rollno holding invalid brcode ...");
			}else {
				System.out.println("Enter the name : ");
				String name=sc.nextLine();
				System.out.println("Enter the Branch : ");
				String br=sc.nextLine().toUpperCase();
				
				CheckBranch cb=new CheckBranch();
			    boolean k=cb.verifyBranch(br);
			    
			    if(k) {
			    	if(branch.equals(br)) {
			    		System.out.println("Enter 6 sub marks...");
			    		int i=1;int total=0;
			    		while(i<=6) {
			    			
			    			System.out.println("Enter the subject marks :");
			    			int sub=sc.nextInt();
			    			if(sub<0&&sub>100) {
			    				System.out.println("invalid marks...");
			    				continue;
			    			}
			    			total=total+sub;
			    			i++;
			    			
			    		}
			    		System.out.println("rollno :"+ rollno);
			    		System.out.println("name : "+ name);
			    		System.out.println("Branch : "+branch);
			    		System.out.println("total marks : "+total);
			    		float per=(float)total/6;
			    		System.out.println("percentage :"+ per);
			    		
			    		StudentResult sr=new StudentResult();
			    		String result=sr.grade(per);
			    		System.out.println("result :" +result);
			    	}
			    	
			    }else {
			    	System.out.println("rollno not matched with branch ...");
			    	
			    }// third condition end;
				
				
			}// second condition end;
			
			
		}else {
			System.out.println("invalid rollno .....");
		}// first condition end;
		
	}// main is ended
		
}
