package test;


//* 5)=>Niven/Harshad number or not A number which is divisible by sum of its digits
// 

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("****** A number which is Niven/harshad number or not ********\n ");
		System.out.println("Enter the number : ");
	    int n=sc.nextInt();
	    int m=n;
	    int sum=0;
	    while(n!=0) {
	    	int d=n%10;
	    	sum=sum+d;
	    	n=n/10;
	    	
	    	
	    }
	    if(n/sum==0) {
	    	System.out.println("yes");
	    }else {
	    	System.out.println("not");
	    }
	    
	    sc.close();
	}

}
