package String_Practice;
import java.util.*;
class A1{
	Scanner sc=new Scanner(System.in);
	
	void CharSaparateLine() {
		System.out.println("Enter String :");
		String s=sc.nextLine();
		int Ucount=0;
		int Lcount=0;
		int Dcount=0;
		
		for(int i=0;i<s.length();i++) { 
			char c=s.charAt(i);
		//	System.out.println(c);                                     // printing Separate Line
		//	System.out.println("ASCII :"+(int)c);                      // converting char to ASCII every Char in a String
		
//			if(Character.isUpperCase(c)) {
//				System.out.println(c);                                 // printing UpperCase char only 
//			}
			
//			if(Character.isLowerCase(c)) {                             // printing LowerCase char only
//			System.out.println(c); 
//			}                             
//		}
	
//			if(Character.isDigit(c)) {                                 // printing only digits
//				System.out.println(c);
//			}
			
//			if(Character.isLetterOrDigit(c)) {                          // printing Letters and characters
//				System.out.println("L/d :"+c);
//			}
			                                    
		if(Character.isUpperCase(c)) {                              // Count upperCase Characters
				Ucount++;
			}
		if(Character.isLowerCase(c)) {                              //count LowerCase Characters
			Lcount++;
		}
		if(Character.isDigit(c)) {                                  // count Digits Characters     
			Dcount++;
		}
		}
		System.out.println("Upper :"+Ucount);
		System.out.println("Lower :"+Lcount);
	    System.out.println("Digits :"+Dcount);
	}

}

class A2{
	void col() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
//			if(c=='M') {
//				count++;
//				
//			}
			char u=Character.toUpperCase(c);
			if(u=='R') {
				System.out.println(u);
			}
		
		}
	//	System.out.println("Number of Charaters :"+count);
	}
	
}
// counting vowels 
class A3{
	Scanner sc=new Scanner(System.in);
	void con() {
		System.out.println("Enter the String :");
	String s=sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if((c=='A'||c=='a')||
		   (c=='E'||c=='e')||
			(c=='I'||c=='i')||
			(c=='O'||c=='o')||
			(c=='U'||c=='u')) {
			count++;
			
		}
		
	}
	System.out.println("Number of vowels :"+count);
	}
	
}

class B1{
	void create() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String s=sc.nextLine();
		
		String d="",r="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				d=d+c;
			}else {
				r=r+c;
			}
		}
		System.out.println(d+" "+r);
	}
}

// creating String first upper & lower characters;
class B2{
	void create() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String s=sc.nextLine();
		
		String u="",l="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(Character.isUpperCase(c)) {
				u=u+c;
			}else {
				l=l+c;
			}
			
			
		}
		System.out.println("Upper :"+u+" Lower :"+l);
		
	}
	
}

//creating String remove space;
class B3{
	void create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		
		String r="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!Character.isWhitespace(c)) {
				r=r+c;
			}
		}
		System.out.println(r);
	}
}

public class Main1 {
   public static void main(String[] args) {
	  // A1 a1=new A1();
	   //a.CharSaparateLine();
	   
//	   A2 a2=new A2();
//	   a2.col();
	   
//	   A3 a3=new A3();
//	   a3.con();
	   
//	   B1 b=new B1();
//	   b.create();
	   
//	   B2 b=new B2();
//	   b.create();
	   
//	   B3 b=new B3();
//	   b.create();
	   
	   
	   
   }
	
}


