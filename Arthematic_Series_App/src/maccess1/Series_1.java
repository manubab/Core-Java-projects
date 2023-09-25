package maccess1;
import java.util.*;

public class Series_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value  :");
		int n=sc.nextInt();
		System.out.println("Enter the value :");
		int x=sc.nextInt();
		// int sum=0;
		double sum=0;
		
		for(int i=0,a=1;i<n;i++,a++) {
			sum=sum+a;
		}
		System.out.println("Sum :"+sum);
	}

}
