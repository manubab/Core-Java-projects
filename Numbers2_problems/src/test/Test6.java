package test;

//* 7)=>neon number or not where sum of digits of square of the number is equal to the number 

//  e.g : 9,9*9=81,9=8+1;


import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("\n Neon number or not : ");
           System.out.println("Enter the number : ");
           int n=sc.nextInt();
           int m=n;
           int sum=0;
           int prod=1;
           while(n!=0) {
        	   int d=n%10;
        	   sum=sum+d;
        	   prod=prod*d+1;
        	   n=n/10;
           }
           if(sum==prod) {
        	   System.out.println("yes");
           }else {
        	   System.out.println("not");
           }
	}

}
