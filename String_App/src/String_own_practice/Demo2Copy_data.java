package String_own_practice;
import java.util.*;
public class Demo2Copy_data {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String !");
		String x=sc.nextLine();
		char[] c=x.toCharArray();
		int size=x.length();
		char[] d=new char[size];
		int i=0;
		while(i!=size) {
			d[i]=c[i];
			++i;
			
		}
		System.out.println(d);
	}

}
