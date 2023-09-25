package com.test.sw;

public class Test {
	public static String name;
	public static String br;
	
	public static void main(String[] args) {
	
		try {
		int nl=name.length();
		int bl=br.length();
		System.out.println("Length of the name :"+nl);
		System.out.println("Length of the br : "+bl);

		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
		System.out.println("name :"+name);
		System.out.println("br :"+br);
		
			
	
	}
	

}
