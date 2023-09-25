package maccess1;
import java.util.*;


//  2^x+4^x+6^x...20;

public class Series_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		System.out.println("Enter x value :");
		int x=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=2;i<n;i++,a+=2) {
			sum=sum+Math.pow(a, x);
			
		}
		System.out.println("sum :"+sum);
		

	}

}
