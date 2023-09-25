package Practice;
import java.util.Scanner;

public class String_Demo5 {
	public static void main(String[] args) {
		System.out.println("====printing ASCII DATA====");
		
		for(int i=65;i<=90;i++) {
			char c=(char)i;
			System.out.println("Upper Case Character : "+c);
		}
		for(int i=97;i<=122;i++) {
			char c1=(char)i;
			System.out.println("Lower Case Character :"+c1);
			
		}
		for(int i=48;i<=57;i++) {
			char c2=(char)i;
			System.out.println("Number values :"+ c2);
		}
		
	}

}
