package maccess;

import java.util.*;

/*
 * 1!+2!+3!+....N;
 * 
 * 9!+13!+17!...N;
 * 
 * 2!+4!+8!+16!+....N;
 * 
 * 10!+9!+8!+....1!;
 * 
 * 1x2+1x2x3+...N;
 * 
 * 
 * (X^1/1!)+(x^2/2!)+(X^3/3!)+...N;
 * 
 * (x^1/9!)+(x^3/13!)+(x^5/17!)+....N;
 * 
 * (1+x/2!)+(11+x/4!)+(21+x/8!)+....N;
 * 
 * (1+2/1*2)+(2+3/1*2*3)+....N;
 * 
 * (1+x)!/2!+(2+x)!/4!+(3+x)/8!+(4+x)!/16!+.....N;
 * 
 * (1+2/1*2)+(1+2+3/1*2*3)+(1+2+3+4/1*2*3*4)....N;
 * 
 */

 public class Series_1_Main_Questions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value :");
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=0,a=1;i<n;i++,a++) {
			int fact=1;
			for(int j=0;j<a;j++) {
				sum=sum+fact;
			}
			
		}
		System.out.println("Sum :"+sum);

	}

}
