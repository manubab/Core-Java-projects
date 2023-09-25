package String_own_practice;
import java.util.*;
public class Demo3_Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String x=sc.nextLine();
		char []a=x.toCharArray();
		int size=a.length;
		char []b=new char[size];
		int i=0;
		while(i!=size) {
			b[size-1-i]=a[i];
			++i;
		}
		System.out.println(b);
		System.out.println(a);
		
		
	}

}
