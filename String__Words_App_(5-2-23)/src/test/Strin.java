package test;

public class Strin {
	public static String s="i am a software coder";
	public static String w="";
    public static void main(String[] args) {
    	
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(c!=' ')
    		if(Character.isUpperCase(c))
    			
    		w+=c;
    	    else
    	    	System.out.println(w);
    	      
    	        w="";
    	        
    	}
	
     }
	

	
}
