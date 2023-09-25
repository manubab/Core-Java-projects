package maccess;
import java.util.*;

//   Write a program to Display String Objects Using Array....
public class DemoArrays2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n=sc.nextInt();
		
		String[] str=new String[n];
		
		System.out.println("Enter "+ n +" Elements into Array Elements : ");
		
		for(int i=0;i<str.length;i++) {
			str[i]=new String(sc.nextLine());// Adding elements ....
		}
		// Displaying Elements from Array
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i].toString());
		}
		

		for(String k: str) {
			System.out.println(k.toString());
		}
		
	}

}
