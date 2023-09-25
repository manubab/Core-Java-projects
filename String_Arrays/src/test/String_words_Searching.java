package test;
public class String_words_Searching {
	public static void main(String[] args) {
		String[] s= {"Apple","Banana","Orange"};
		String key="Banana";
		boolean flag =false;
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==key) {
				System.out.println("Available index "+ i);
				
				flag=true;
				
			}
			
		}
		if(flag==false) {
			System.out.println("Not Found ..");
		}
		
		
	}

}
