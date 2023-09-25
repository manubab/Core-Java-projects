package maccess;
import java.util.*;
public class DemoToken2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=null;
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int len=s.length();
		StringTokenizer ob=new StringTokenizer(s, " ");
		System.out.println("Count of Tokens :"+ ob.countTokens());
		
		while(ob.hasMoreTokens()) {
			String s1=ob.nextToken();
			char ck=s1.charAt(0);
			
			switch(ck) {
			case 'a': 
			case 'A':
				sb=new StringBuffer(s1);
				System.out.print(sb.reverse()+" ");
				break;
			case 'e': 
			case 'E':
				sb=new StringBuffer(s1);
				System.out.print(sb.reverse()+" ");
				break;
				
			case 'i': 
			case 'I':
				sb=new StringBuffer(s1);
				System.out.print(sb.reverse()+" ");
				break;
			case 'o': 
			case 'O':
				sb=new StringBuffer(s1);
				System.out.print(sb.reverse()+" ");
				break;
			case 'u': 
			case 'U':
				sb=new StringBuffer(s1);
				System.out.print(sb.reverse()+" ");
				break;
				default:
					System.out.print(s1.toString()+" ");
			}
		}
		
		System.out.println("\n********************");
		System.out.println("Number of Tokens: "+ob.countTokens());
	}

}
