package Practice;
import java.util.*;
public class Bank {
	
	static int n=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bank Account balence");
		
		int balence=sc.nextInt();
		
		Diposit();
		
		withDraw();
		
		getCurrentAmount();
		
		
		
	}
	private static void Diposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many times u perform the operation");
		int N=sc.nextInt();
		for(int i=0;i<=N;i++) { 
		
		System.out.println("Modify the acount balence");
		n=sc.nextInt();
		System.out.println("Enter diposit amount");
		int DA=sc.nextInt();
		
		int c=n+DA;
		System.out.println(c);
		
		}	
	}
	private static void withDraw() {
		
		Scanner sc=new Scanner(System.in);
		n=5000;
		System.out.println("WithDraw how many operations");
		int wm=sc.nextInt();
		for(int i=1;i<=wm;i++) {
		System.out.println("Enter with drawAmount");
		int w=sc.nextInt();
		int W=n-w;
		
		System.out.println(W);
		}
	}
	private static void getCurrentAmount() {
		Scanner sc=new Scanner(System.in);
		int CurBal=n;
		System.out.println(CurBal);
		
	}

}

		
	
	
	
	
	

	
	
	


