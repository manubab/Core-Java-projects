package maccess1;
import java.util.*;


// 9^2+13^2+17^2....N;

public class Series_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=9;i<n;i++,a+=4) {
			sum=sum+Math.pow(a, 2);
		}
		System.out.println("Sum :"+sum);
	}

}
