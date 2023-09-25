package test;
public class Words_In_A_String {
	public static void main(String[] args) {
		String s="A Red Seed ";s+="";
		int count=0;
		String w="";
		
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w+=c;
			}else {
//				System.out.println(w); //print each word in saparete line;
//				System.out.println(w.charAt(0));// print each word in a starting leter;
//				System.out.println(w.substring(0, 3));
				
//				if(w.startsWith("R"))
//				if(w.endsWith("ed"))
//				if(w.contains("e"))
				
//				if(w.length()==3)
//				if(w.length()%2==0)
				
//				char f=w.charAt(0);
//				char I=w.charAt(w.length()-1);
				
//				if(Character.toUpperCase(f)==Character.toUpperCase(I))
//				if(w.length()>s.length())
					s=w;
				count++;
				w="";
			}
		}
		System.out.println("number of words in a String :"+count);
		
	}

}
