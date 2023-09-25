package maccess;
import java.util.*;
public class Demo_String_Find_UniqueCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		int len=s.length();
		
		String w="";
		
		for(int i=0;i<=len-1;i++) {
			char ch=s.charAt(i);
			for(int j = i;j<=len-1; j++)
			
			{
				if(ch!=s.charAt(j)) {
					w+=ch;
					break;
			}
			
				
			
				
		}
		
	}
		System.out.println(w);

	}
}
