package maccess;
import java.util.Scanner;
public class Reverse_words_in_Stringd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		for(String S:arr)
		{
			StringBuffer sb=new StringBuffer(S);
			
			sb.reverse();
			System.out.println(sb);
		}

	}
	

}
