package maccess;
import java.util.*;

//   2-6+18-54+....N;

public class Series_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=2;i<n;i++,a*=3) {
			if(i%2==0) {
				sum=sum-a;
			}else {
				sum=sum+a;
			}
		}
		System.out.println("sum :"+sum);

	}

}
