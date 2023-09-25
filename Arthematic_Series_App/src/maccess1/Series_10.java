package maccess1;
import java.util.*;

// 2/10+4/9+6/8+...20/1;

public class Series_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=2,d=10;i<n;i++,a+=2,d--) {
			sum=sum+a/d;
			
		}
		System.out.println("sum :"+sum);

	}

}
