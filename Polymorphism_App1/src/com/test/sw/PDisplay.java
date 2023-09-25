package com.test.sw;
public class PDisplay {
	private int a=10;
	private static int b=20;
	private int c;
	private static int d;
	
	private PDisplay() {
		
	}
	public static PDisplay p=new PDisplay();
	
	
	private void dis1(int c) {
		System.out.println("**** private instance dis1(c) ****");
		System.out.println(" The value of a :"+c);
	}
	private static void dis2(int d) {
		System.out.println("** private staic int dis2(d) **");
		System.out.println(" The value of d :"+d);
	}
	public void access() {
		
		System.out.println("*** accessing private components ***");
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);
		
		this.dis1(c);
		PDisplay.dis2(d);	
	}
	
	

}
