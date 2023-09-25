package maccess;
/*
 * read 2 Integer 3x3 matrix
 * 
 * display 2 matrix  
 * 
 * sum of 2 Integer 3x3 matrix
 * 
 * print sum of 2 integer matrix
 * 
 *
 */

import java.util.*;

public class DemoArrays_2D {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 1 integer 3x3 matrix Elemets :");
		Integer b[][] = new Integer[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				b[i][j] = new Integer(sc.nextLine());
			} // inner loop close...
		} // outer loop close....
		System.out.println("\nEnter 2 Integer 3x3 matrix Elements :");
		Integer b1[][] = new Integer[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				b1[i][j] = new Integer(sc.nextLine());
			} // inner close...
		} // outer close...
		System.out.println("\nDisplay First Elements Elements : ");
		for (Integer k[] : b) {
			for (Integer z : k) {
				System.out.print(z.toString() + " ");
			} // inner close...
			System.out.println();
		} // outer close...

		System.out.println("\nDisplay Secong Integer Matrix : ");
		for (Integer k[] : b1) {
			for (Integer z : k) {
				System.out.print(z.toString() + " ");
			} // inner close..
			System.out.println();
		} // outer close...
		Integer[][] c = new Integer[3][3];
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				c[i][j] = b[i][j] + b1[i][j];
			}
		}
		System.out.println("\n***Displaying Additon 2 Matrix and Display c matrix :");
		for (Integer a[] : c) {
			for (Integer l : a) {
				System.out.print(l.toString() + " ");
			}
			System.out.println();
		}
	}

}
