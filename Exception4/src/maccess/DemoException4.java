package maccess;
import test.Test;
import java.util.*;
public class DemoException4 extends Exception
{
	public static void main(String[] args) throws Test{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value :");
		int n=sc.nextInt();
		if(n<0&&n==0) {
			Test t=new Test("Enter only Integer value :");
		}
		Test ob=new Test("");
		ob.factorial(n);
		
	}

	
}
