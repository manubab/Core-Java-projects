package maccess;

import java.util.*;

//   (x+5^2/1+2)+(x+25^2/2+3+....N);



public class Series_7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value : ");
		int n=sc.nextInt();
		System.out.println("Enter x value :");
		int x=sc.nextInt();
		
		double sum=0;
		
		for(int i=0,a=5,b1=1,b2=2;i<n;i++,a*=5,b1++,b2++) {
			sum=sum+x+Math.pow(a, 2)/b1+b2;
			
		}
		System.out.println("Sum :"+ sum);
	}

}
