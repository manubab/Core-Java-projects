package maccess;

import java.util.*;

/*
 *                1)  solution => 2+4+8+16+...N;
 * 
 * 
 * 2+6+18+54+...N;
 * 
 * 10+30+90+270...N;
 * 
 * 5+25+125+.....N;
 * 
 * x/2+x/4+x/8+x/16....N;
 * 
 * 2-6+18-54+....N;
 * 
 * x+2/10+x+4/30+x+6/90+....N;
 * 
 * (x+5^2/1+2)+(x+25^2/2+3+....N);
 * 
 * 
 * 
 * 
 */
public class Series_1_Main_Questions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=2;i<n;i++,a*=2) {
			sum=sum+a;
			
		}
		System.out.println("Sum :"+ sum);

	}

}
