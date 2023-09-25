package test;
import java.util.Scanner;
public class Practice_06_2_23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings :");
		Practice_06_2_23.m1(sc.nextLine(), sc.nextLine());
		Practice_06_2_23 p1=new Practice_06_2_23(12,32,34);
		System.out.println("Enter the numbers");
		p1.m2(sc.nextInt(), sc.nextInt());
	}
	public static void m1(String s1,String s2 ) {
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				char c=s1.charAt(i);
				char d=s2.charAt(j);
				System.out.print(c+"\n");
				System.out.print(d);

			}
		}
		
		
	}
	public void m2(int a,int b) {
		System.out.println(a+b);
		int c=a+b;
		for(int i=0;i<10;i++) {
			c++;
			System.out.println("i am c in java m2 local variable : "+c);
		}
	}
	Practice_06_2_23(){
		System.out.println("\njava code writer");
	}
	{
		System.out.println("\ni am instance block raju");
	}
	static {
		System.out.println("\ni am static block raju boy");
	}
	public Practice_06_2_23(long a,long b,long c) {
		System.out.println(a+b+c);
		
	}
}
	


