package Practice;
import java.util.*;
class Customer {
	private int cid;
	private String cname;
	private String City;
	private String mailid;
	private long phno;
	
	Customer(int cid,String cname,String city,String mailid,long phno){
		this.cid=cid;
		this.cname=cname;
		this.City=city;
		this.mailid=mailid;
		this.phno=phno;
		
	}
	public static void main(String[] args) {
		
	
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String toString() {
		return cid+""+cname+""+City+""+mailid+""+phno;
	}

}

public class CrudDemo{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		List<Customer> c=new ArrayList<>();
		
	
		int choice;
		do {
			System.out.println("===============================================================");
			System.out.println("1.insert ");
			System.out.println("2.display ");
			System.out.println("3.search ");
			System.out.println("4.delete ");
			System.out.println("5.update ");
			
			System.out.println("Enter your choice : ");
		     choice=sc.nextInt();
			
			switch(choice) {
			
			
			case 1:
				System.out.println("============================");
				System.out.println("Enter cid : ");
				int cid=sc.nextInt();
				System.out.println("Enter cname : ");
				String cname=sc1.nextLine();
				System.out.println("Enter city name : ");
				String city=sc2.nextLine();
				System.out.println("Enter mailid : ");
				String mailid=sc1.nextLine();
				System.out.println("Enter phno : ");
			    long phno=sc.nextLong();
			    
			    c.add(new Customer(cid,cname,city,mailid,phno));
			    
			    System.out.println("==================================");
			    
			    break;
			    
			case 2:
				
				System.out.println("================================================================");
				System.out.println(c);
				Iterator<Customer> i=c.iterator();
				while(i.hasNext()) {
					Customer C=i.next();
					
					
				}
				System.out.println("======================================");
				break;
				
			case 3:
				
				boolean found=false;
				System.out.println("================================================");
				System.out.println("Enter cid to search");
				
				System.out.println("Enter cid number");
				cid=sc.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					Customer C=i.next();
					if(C.getCid()==cid) {
						System.out.println(C);
						
						found=true;
						
					}
					
				}
				if(!found) {
					System.out.println("cid not found");
				}
				System.out.println("================================");
				
				break;
				
			case 4:
				
				found=false;
				System.out.println("================================================");
				System.out.println("Enter cid to delete");
				
				System.out.println("Enter cid number");
				cid=sc.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					Customer C=i.next();
					if(C.getCid()==cid) {
						i.remove();
						
						found=true;
					}
				}
				System.out.println("======================");
				break;
				
				
				
			case 5 :
				System.out.println("====================================================");
				System.out.println("enter cid to update ");
				cid=sc.nextInt();
				
				ListIterator<Customer>li=c.listIterator();
				while(li.hasNext()) {
					Customer C=li.next();
					if(C.getCid()==cid) {
						System.out.println("Enter new name");
						cname=sc.nextLine();sc.nextLine();
						System.out.println("Enter new city name");
						city=sc1.nextLine();
						System.out.println("Enter new mailid");
						mailid=sc2.nextLine();
						System.out.println("Enter new phno");
						phno=sc3.nextLong();
						
						System.out.println(C);
						
						
						
					}else {
						System.out.println("customer record not found");
					}
					System.out.println("update sucessfully");
					
					
				}
				System.out.println("=============================================");
				break;
				
				
				
			}
				
			
		}
		while(choice!=0);
				}
			}
		
		
		
		
			
		
		
			
		
		
		
	
	
	

