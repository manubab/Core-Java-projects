package maccess1;
import java.util.*;

/*
 *  1+2+3.....N;
 *  
 *  9+13+17+....N;
 *  
 *  2+4+6+8....;
 *  
 *  1+3+5+....N;
 *  
 *  10+9+8+....1;
 *  
 *  
 *  ------------------
 *  
 *  X^1+X^2+X^3....N;
 *  
 *  9^2+13^2+17^2....N;
 *  
 *  2^x+4^x+6^x...20;
 *  
 *  1^3/x+3^3/x+5^3/x....N;
 *  
 *  2/10+4/9+6/8+...20/1;
 *  
 *  
 *  
 * 
 */

public class Series_2_Main_Questions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0,a=9;i<n;i++,a+=4) {
			sum=sum+a;
		}
		System.out.println("Sum :"+sum);
	
	}

}
