package nit;

import java.util.*;

import  test.JavaCOde;
import test.Static_Source;

public class DemoStatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		Static_Source ss=new Static_Source();
		Static_Source.main(args);
	int c=	Static_Source.cal(a,b);
		
		System.out.println("result"+ c);
		int d=JavaCOde.mul(a, b);
		System.out.println("result"+ d);
	}

}
