package maccess1;
import java.util.*;

//   10+9+8+....1;

public class Series_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		double sum=0;
		for(int i=0,a=10;i<n;i++,a--) {
			sum=sum+a;
		}
		System.out.println("Sum : "+sum);

	}

}
