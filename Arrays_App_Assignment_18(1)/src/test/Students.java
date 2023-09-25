package test;
import java.util.*;
public class Students {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rollno :");
		String rollno=sc.nextLine();
		
		// Roll no checking//
		if(rollno.length()==10) {
			String brcode=rollno.substring(6, 8);
			GenarateBranch gb=new GenarateBranch();
			String branch=gb.genarateBranch(brcode);
			if(branch==null) {
				System.out.println("\nrolllno holding invalid Branch code....!");
			}else {
				System.out.print("\nEnter Student name :");
				String name=sc.nextLine();
				System.out.print("\nEnter branch :");
				String br=sc.nextLine().toUpperCase();
				CheckBranch cb=new CheckBranch();
			boolean b=	cb.validBranch(br);
			if(b) {
				if(branch.equals(br)) {
					System.out.print("\nEnter 6 subjects marks...");
					int i=1,total=0;
					
					while(i<=6) {
						System.out.print("\nEnter sub -1 : Marks...!");
						int sub=sc.nextInt();
						if(sub<0||sub>100) {
							System.out.print("invalid marks..!");
							continue;
						}
						
						total=total+sub;
						 
						i++;
					}
					System.out.println("rollno :"+rollno);
					System.out.println("name : "+name);
					System.out.println("branch"+branch);
					System.out.println("total :"+total);
					float per=(float)total/6;
					StudentResult rs=new StudentResult();
					String result=rs.result(per);
					System.out.println("per :"+per);
					System.out.println("Result"+result);
				
				}else {
					System.out.print("rollno holding invalid branch code ...");
				}
				
			}else {
				System.out.print("Rollno holding invalid branch code ....");
			}	
				
			}
		}else {
			System.out.print("Invaid branch..");
		}
			
		
	}

}
