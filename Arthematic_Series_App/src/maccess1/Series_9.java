package maccess1;
import java.util.*;


//  1^3/x+3^3/x+5^3/x....N;

public class Series_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		System.out.println("enter x value :");
		int x=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=1;i<n;i++,a++) {
			sum=sum+Math.pow(a, 3)/x;
		}
		System.out.println("sum :"+sum);

	}

}
