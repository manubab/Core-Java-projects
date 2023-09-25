package test;
import java.util.*;

//    6)=>dock number or not A number which has zeroes present in it e.g 402,280;

public class Test5 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**** Duck number or not Cheking ******\n");
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int m=n;
		int count=0;
		while(n!=0) {
		int d=n%10;
		if (d ==0) {
			count+=1;
			n=n/10;
		
		
		}
		}
		if(count>0) {
			System.out.println("yes");
			
		}else {
			System.out.println("not");
		}
		
		sc.close();
	}

}
