package maccess;
import java.util.*;
import test.Test;
public class Demo_Arrays6 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Integer a[][]=new Integer[3][3];
		System.out.println("Enter  3x3 matrix -1");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				a[i][j]=new Integer(sc.nextLine());
			}
		}
              Integer b[][]=new Integer[3][3];
              System.out.println("Enter 3x3 matrix -2");
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				b[i][j]=new Integer(sc.nextLine());
			}
		}
		         Test t=new Test();
	             Integer c[][]=t.add(a, b);
	             System.out.println("Displaying 3x3 Matrix :");
	            for(Integer k[]:c ) {
	            	for(Integer z:k) {
	            		System.out.print(z.toString()+" ");
	            	}
	            	System.out.println();
	            }
	            sc.close();
	}

}
