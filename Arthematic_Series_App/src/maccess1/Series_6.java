package maccess1;
import java.util.*;

// X^1+X^2+X^3....N;

public class Series_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number value :");
		int n=sc.nextInt();
		System.out.println("Enter x value : ");
		int x=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=1;i<n;i++,a++) {
			sum=sum+Math.pow(x, a);
		}
		System.out.println("Sum :"+sum);

	}

}
