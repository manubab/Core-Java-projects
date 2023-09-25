package test;

public class Count_Words_In_String {
	public static String s="java 17 version by which is its";
	public static void main(String[] args) {
		for(int i=0;i<s.length()-1;i++) {
		String[] s1=s.split(s);
		String s3=s1[i];
		System.out.println(s3.length());
		}
	
		
	}

}
