package test;
public class Palindrome_String {
	public static String s="maam";
	public static String rev="";
	public static String original=s;
	
	public static void main(String[] args) {
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		if(original.equals(rev)) {
			System.out.println("its palindrome ");
		}else {
			System.out.println("its not palindrome");
		}
		
		
	}

}
