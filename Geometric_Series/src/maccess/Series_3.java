package maccess;
import java.util.*;

//   5+25+125+.....N;

public class Series_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=5;i<n;i++,a*=5) {
			sum=sum+a;
		}
		System.out.println("Sum :"+ sum);
	}

}
