package maccess;
import test.*;
import java.util.*;

public class DemoException2 extends Exception {
	DemoException2(String msg){
		super(msg);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		try 
		{
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter rollNo :");
		String rollNo =sc.nextLine();
		if(rollNo.length()!=10) {
			DemoException2 ob=new DemoException2  //Exception condition
					("invalid rollNo..!");
			throw ob;
		}
		 GenarateBranch gb=new GenarateBranch();
	     String gbr=gb.genarateBranch(rollNo.substring(6, 8));
	     if(gbr==null) {
				DemoException2 ob=new DemoException2 //Exception condition
						("rollNo holding invalid branch code..!");
				throw ob;
	     }
	     System.out.println("Enter branch :");
	     String branch=sc.nextLine().toUpperCase();
	     CheckBranch cb=new CheckBranch();
	          boolean b=cb.verify(branch);
	          if(!b)
	          {
	  			DemoException2 ob=new DemoException2  //Exception condition
	  					("invalid branch..!");
	  			throw ob;
	          }
	          if(gbr.equals(branch))
	          {
		  			DemoException2 ob=new DemoException2  //Exception condition
                     ("rollNo not Matched with Branch...!");
	          }
	          int i=1; int total=0;
	          while(i<=6) {
	        	  System.out.println("Enter Sujects marks ..!");
	        	  
	        	  int sub=sc.nextInt();
	        	  if((sub<0||sub>100)) {
	        		  DemoException2 ob=new DemoException2
	        				  ("invalid marks..!");
	        		  throw ob;
	        	  }
	        	  total=total+sub;
	        	  i++;
	        	  if(sub<35) {
	        		  DemoException2 ob=new DemoException2
	        				  ("fail");
	        	  }
	        	  
	        	  
	          }
		System.out.println("**** Student details ****");
		System.out.println("Name :"+name);
		System.out.println("rollNo :"+rollNo);
		System.out.println("branch :"+branch);
		System.out.println("totalMarks :"+total);
		float per=total/6;
		System.out.println("Percentage :"+per);
		  StudentResult ob=new StudentResult();
		  if(per<35) {
			  DemoException2 ob1 = new DemoException2(" result :fail");
			  throw ob1;
		  }
		 String result=ob.grade(per);
		 System.out.println("Result :"+result);
		}
		catch(DemoException2 de) {
			System.out.println(de.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
