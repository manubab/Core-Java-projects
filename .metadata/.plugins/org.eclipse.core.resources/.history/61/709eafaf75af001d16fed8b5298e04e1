package maccess;
import java.util.*;
import test.Products;
public class Demo_Products_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of products : ");
		int n=Integer.parseInt(sc.nextLine());
		Products[] p=new Products[n];
		System.out.println("\nEnter "+n+" Numbers of products");

		for(int i=0;i<p.length;i++) {
			System.out.print("\nEnter "+(i+1)+" product Details\n");
            	System.out.print("\nEnter pcode :");
            	String pcode=sc.next();
            	System.out.print("\nEnter pname :");
            	String pname=sc.next();
            	System.out.print("\nEnter price :");
            	int price=sc.nextInt();

			p[i]=new Products(pcode,pname,price);
		}
		System.out.println("***Products Details****\n\t");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].toString());
		}
		
		
		System.out.println("\n****Using Enhaned For loop :\n ");
		
		for(Products p1:p) {
			System.out.println(p1.toString());
		}
		System.out.println("Enter Conditon Price :");
		int cpri=sc.nextInt();
		System.out.println("****Product Details Based on Price Conditon ****");
1
		for(int i=0;i<p.length;i++) {
			if(p[i].price>cpri) {
				
				System.out.println(p[i].toString());
				
			}
		}
		
			
		
	}
}




