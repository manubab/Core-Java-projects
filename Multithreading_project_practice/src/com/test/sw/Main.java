package com.test.sw;


public class Main {
	{
		System.out.println("nsb :"+Thread.currentThread());
	}
	static {
		System.out.println("sb :"+Thread.currentThread());

	}
	static int a=m1();
	static int m1() {
		System.out.println("m1 :"+Thread.currentThread());
		return 111;
	}
	int b=m2();
	int m2() {
		System.out.println("m2 :"+Thread.currentThread());
		return 222;
	}
	Main(){
		System.out.println("con :"+Thread.currentThread());
	}
	public static void main(String[] args) {
		
		System.out.println("main :"+Thread.currentThread());
		
	Main m=new Main();
	
	}
	
}
