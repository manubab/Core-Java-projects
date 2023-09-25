package maccess1;
import java.util.*;

// 1+3+5+....N;

public class Series_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=1;i<n;i++,a+=2) {
			sum=sum+a;
		}
		System.out.println("Sum :"+sum);
			

	}

}
