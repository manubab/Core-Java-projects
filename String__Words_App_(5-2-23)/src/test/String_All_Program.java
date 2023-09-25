package test;

public class String_All_Program {
	public static void main(String[] args) {
		String s = "java programer  its my job";
		String w = "";int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				
				count++;
				w+=c;
				
			} else {
				char f=s.charAt(0);
				char l=s.charAt(s.length()-1);
				System.out.println(s.substring(f, l));
				

			}
		}
	}
}


