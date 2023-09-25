package maccess;
import java.util.*;

//  10+30+90+270...N;


public class Series_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=10;i<n;i++,a*=3) {
			sum=sum+a;
			
		}
		System.out.println("Sum :"+sum);
	}

}
