package Practice;

import java.util.ArrayList;
import java.util.*;

class Employee {
	private int eid;
	private String ename;
	private int sal;
	
	Employee(int eid,String ename,int sal){
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public String toString() {
		return eid+""+ename+""+sal+"";
	}

}
public class CudeDemo{
	public static void main(String[] args) {
		List<Employee> c=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("1.insert");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4.delete");
			System.out.println("5.update");
			System.out.println("Enter your choice  : ");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("================================");
				System.out.println("Enter emp eid : ");
				int eid=sc.nextInt();
				System.out.println("Enter emp ename : ");
				String ename=sc1.nextLine();
				System.out.println("Enter emp sal : ");
				int sal=sc.nextInt();
				
				
				c.add(new Employee(eid,ename,sal));
				
				break;
				
			case 2 :
				
			    System.out.println("----------------------------------------------------------------");
				System.out.println("dispaly emp details");
			    Iterator<Employee>i=c.iterator();
				while(i.hasNext()) {
					System.out.println(" ");
					Employee e=i.next();
				System.out.println(e);
				}
				System.out.println("-----------------------------------------------------------");
				break;
				
			case 3 :
				
				
				 boolean found=false;
				 System.out.println("Enter empno search");
				 
				 int empno=sc.nextInt();
				 System.out.println("----------------------------------");
				 
				 i=c.iterator();
				 while(i.hasNext()) {
					 Employee e=i.next();
					 if(e.getEid()==empno) {
						 System.out.println(e);
						 found=true;
					 }
				 }
				 if(!found) {
					 System.out.println("record not found");
				 }
				 System.out.println("---------------------------------");
				 
				 break;
				 
			case 4 :
				
				  found=false;
				 System.out.println("Enter empno delete");
				 
				 int empno1=sc.nextInt();
				 System.out.println("----------------------------------");
				 
				 i=c.iterator();
				 while(i.hasNext()) {
					 Employee e=i.next();
					 if(e.getEid()==empno1) {
						i.remove();
						 found=true;
					 }
				 }
				 if(!found) {
					 System.out.println("record not found");
				 }else {
					 System.out.println("record delete succesfully");
				 }
				 System.out.println("---------------------------------");
				 
				 break;
				 
				 
			case 5 :
				found=false;
				System.out.println("enter emp to update");
				
				empno=sc.nextInt();
				System.out.println("-------------------------------------------------------");
				ListIterator<Employee> li=c.listIterator();
				
				while(li.hasNext()) {
					Employee e=li.next();
					if(e.getEid()==empno) {
						System.out.print("Enter new name");
						 ename=sc1.nextLine();
						System.out.print("Enter new sal");
						 sal=sc.nextInt();
						 li.add(new Employee(empno,ename,sal));
						 found=true;
						 
					}
				}
				 if(!found) {
					 System.out.println("record not found");
				 }else {
					 System.out.println("record update  succesfully");
				 }
				 System.out.println("---------------------------------");
				 
				 break;
			}
		}while(ch!=0); 	
		
	}
}
