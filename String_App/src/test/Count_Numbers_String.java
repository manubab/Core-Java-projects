package test;

public class Count_Numbers_String {
	public static void main(String[] args) {
		String s="java 65 version by 122 whisch is its";
		int digits=0;
		for(int i=0;i<=s.length()-1;i++) {
		if(s.charAt(i)>=0&&s.charAt(i)<=s.length()-1) {
			digits++;
			System.out.println((char)i);
			
			
		}
		
		}
		System.out.println("Total no of digits"+digits);
	}
}
