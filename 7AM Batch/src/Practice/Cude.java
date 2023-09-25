package Practice;
import java.util.*;
class MyDemoProject {
	private int sno;
	private String sname;
	private String Branch;
	private int BtchScore;
	
	MyDemoProject(int sno,String sname,String Branch,int Bs){
		this.sno=sno;
		this.sname=sname;
		this.Branch=Branch;
		this.BtchScore=Bs;
		
		
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public int getBtchScore() {
		return BtchScore;
	}

	public void setBtchScore(int btchScore) {
		BtchScore = btchScore;
	}
	
	

}
public class Cude{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		
		List<MyDemoProject> l=new ArrayList<MyDemoProject>();
		
		
		int ch;
		
		do {
			System.out.println("1.insert");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4.update");
			System.out.println("5.delete");
			
			System.out.println("enter your choice : ");
			
			ch=sc.nextInt();
			
			switch(ch){
			
			case 1:
				System.out.println("====================================================");
				System.out.println("Enter sno :");
				int sno=sc.nextInt();
				System.out.println("enter sname :");
				String sname=sc1.nextLine();
				System.out.println("Enter Branch");
				String Branch =sc2.nextLine();
				System.out.println("Enter BtechScore");
				int Bs=sc3.nextInt();
				
				System.out.println("Sucessfully Inserted student values");
				
				System.out.println("=========================================");
				
				break;
				
				
				
			
			}
			
		}while(ch!=0);
		
	}
}
