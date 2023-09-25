package test;
public class Consonents_Program {
	public static void main(String[] args) {
		
		System.out.println("Enter the sentence");
		String s="java 17 version by 2021 which is its";
		int count = 0;
		
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("");
				
			}else if(ch!=' ') {
				count++;
				
			}
		}
		System.out.println("number of consonents in the sentence"+count);
	}

}
