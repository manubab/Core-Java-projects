package maccess;
import java.util.*;

//   x+2/10+x+4/30+x+6/90+....N;

public class Series_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		System.out.println("Enter x value :");
		int x=sc.nextInt();
		double sum =0;
		
		for(int i=0,a=2,b=10;i<n;i++,a+=2,b*=3) {
			sum=sum+(double)x+a/b;
			
		}
		System.out.println("Sum :"+sum);
	}

}
