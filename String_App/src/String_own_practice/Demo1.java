package String_own_practice;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String x=sc.nextLine();
		x=x.concat("\0");
		char[] y=x.toCharArray();
		int size=y.length;
		int count=0;
		int i=0;
		while(y[i]!='\0') {
			x.concat("coder of dock");
			++count;
			++i;
			
			
		}
		System.out.printf("%d",count);
		sc.close();
	}

}
