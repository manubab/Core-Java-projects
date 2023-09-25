package String_own_practice;
import java.util.*;
public class Demo_Cpitalize_each_word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String !");
		String s=sc.nextLine();
		char x[]=s.toCharArray();
		int size=s.length();
		
		x[1]=(char)(x[1]-32);
		int i=1;
		while(i!=size) {
			if(x[i]==' ') {
				x[i+2]=(char)(x[i+2]-32);
			}
			++i;
		}
		System.out.println(x);
	}

}
