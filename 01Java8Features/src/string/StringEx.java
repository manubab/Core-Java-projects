package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringEx {

	static void duplicateWords(String inputString) {
		String[] s = inputString.split(" ");

		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String words : s) {
			if (wordCount.containsKey(words.toLowerCase())) {
				wordCount.put(words.toLowerCase(), wordCount.get(words.toLowerCase()) + 1);
			} else {
				wordCount.put(words.toLowerCase(), 1);
			}
		}
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {

				System.out.println(word + " :" + wordCount.get(word));
			}
		}
	}

//	public static void main(String[] args) {
//		duplicateWords("Bread butter and bread");
//
//		dpwords("mana");
//		
//		
//		System.out.println(totalWords("Bread butter and bread"));
//		
//		
//		
//		String s="Java is java again java again";
//		
//		char c='a';
//		
//		int count=s.length()-s.replace("a", "").length();
//		
//		System.out.println("Number of "+count);
//		
//		
//		
//		reverse("Manu");
//		
//		
//		charCount("Manu ur manu");
//
//	}

	static void dpwords(String input) {
		char[] srr = input.toCharArray();

		for (int i = 0; i < srr.length; i++) {
			for (char c : srr) {
				if (c == srr[i]) {
					System.out.println(srr[i]);

				}
			}
			break;
		}
	}
	
	
	public static int totalWords(String s)
	{
		String [] srr=s.split(" ");
		
		return srr.length;
	}
	
	
	
	public static void reverse(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}	
	
	
	
   static void charCount(String s)
   {
	   HashMap<Character,Integer> cMap=new HashMap<>();
	   
	   char[] strArr=s.toCharArray();
	   
	   for(char c:strArr)
	   {
		   
		   if(cMap.containsKey(c))
		   {
			   cMap.put(c, cMap.get(c)+1);
		   }
		  
		   else
		   {
			   cMap.put(c, 1);
		   }
		  
		   
	   }
	   System.out.println(s +" :"+cMap);
   }
	
   
   
   
   public static void main(String s1,String s2) {
	
	   
	  
	   
	 String x1=  s1.replaceAll("\\s ", "");
	 String x2=  s2.replaceAll("\\s ", "");
	 
	 
	 
	 boolean status=true;
	 
	 if(x1.length()!=x2.length())
	 {
		 status=false;
	 }
	 else
	 {
		 char[] c1=x1.toLowerCase().toCharArray();
		 
		 char[] c2=x2.toLowerCase().toCharArray();

		 Arrays.sort(c1);
		 Arrays.sort(c2);
		 
		 status=Arrays.equals(c1, c2);
		 
		 if(status)
		 {
			 System.out.println("anagram");
		 }
		 else
		 {
			 System.out.println("not");
		 }
	 }  
   }
   
   public static void main(String[] args) {
	
	   main("Mother In Law", "Hitler Woman");
}
   
     
	
	
	
}
