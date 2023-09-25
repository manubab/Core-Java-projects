package maccess1;
import java.util.*;


// 2+4+6+8....;


public class Series_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=2;i<n;i++,a+=2) {
			sum=sum+a;
		}
		System.out.println("Sum :"+sum);

	}

}
