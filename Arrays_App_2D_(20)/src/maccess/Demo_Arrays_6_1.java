package maccess;
import java.util.*;
public class Demo_Arrays_6_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first 3x3 matrix ");
		int x[][]=new int[3][3];
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				x[i][j]=new Integer(sc.nextLine());
			}
		}
		System.out.println("Enter first 3x3 matrix ");

		int y[][]=new int[3][3];
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				y[i][j]=new Integer(sc.nextLine());
			}
		}
		System.out.println("Additing two Matrix : ");

		int z[][]=new int[3][3];
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				z[i][j]=x[i][j]/y[i][j];
			}
			
		}
		
		for(int k[]:z) {
			for(int m:k) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
