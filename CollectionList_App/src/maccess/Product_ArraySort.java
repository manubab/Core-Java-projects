package maccess;
import test.*;
import java.util.*;
public class Product_ArraySort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		Integer[] a= {10,11,12,13,14};
		String[] b= {"Cat","Apple","Bat"};
	Product[] p= {
			new Product("A102","CDR",1200,20),
				new Product("A103","SED",200,9),
				new Product("A203","SW",300,8)
		};
         
	     Arrays.sort(p);
	     
	     for(Product p1: p)
	     {
	    	 System.out.println(p1);
	     }
	     Arrays.sort(a);
	     for(Integer a1:a)
	     {
	    	 System.out.print(a1+" ");
	     }
	     Arrays.sort(b);
	     for(String b1:b)
	     {
	    	 System.out.println(b1+" ");
	     }
	
	}

}
