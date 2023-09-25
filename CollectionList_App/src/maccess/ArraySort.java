package maccess;
import java.util.*;
public class ArraySort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {10,12,31,7,8,4};
		System.out.println("Bfore Sotiong ..");
		for(int k :a) {
			System.out.print(k+" ");
		}
		Arrays.sort(a);
		System.out.println("After Sorting...!");
		
		for(int k :a) {
			System.out.print(k+" ");
		}
	}
	

}
