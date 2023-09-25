package maccess;
import java.util.*;   // wap to read and display the reverse of words in the given String;
                      //wap to read and display the reverse of words which starts with vowels

public class DemoStringTokenizer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the String : ");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s, " ");
        System.out.println("=====using StingTokenizer and display the data======");
      
        int count=st.countTokens();
        System.out.println("Count of Tokens : "+ count);
        System.out.println("******result *****");
        while(st.hasMoreTokens()) {
        String s1=	st.nextToken();
        StringBuffer sb=new StringBuffer(s1);
        System.out.print(sb.reverse()+" ");
        }
        
        System.out.println("\n**********************************");
        System.out.println("Number of Tokens : "+st.countTokens());
        sc.close();
	}

}
















