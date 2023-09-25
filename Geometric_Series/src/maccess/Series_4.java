package maccess;
import java.util.*;
 
//   * x/2+x/4+x/8+x/16....N;


public class Series_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		double sum=0;
		
		System.out.println("Enter x value :");
		int x=sc.nextInt();
		for(int i=0,a=2;i<n;i++,a*=2) {
			sum=sum+(double)x/a;
			
		}
		System.out.println("Sum :"+sum);
	}
	

}
