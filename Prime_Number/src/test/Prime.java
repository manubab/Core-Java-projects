package test;
import java.util.Scanner;
public class Prime {
	
	public static void prime(int n) {
		int count=0;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
					
				}
			}
			if(count==2) {
				System.out.println("prime ");
			}else {
				System.out.println("Not prime ");
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Prime.prime(n);
		
	}

}
