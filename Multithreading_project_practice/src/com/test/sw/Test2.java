package com.test.sw;

public class Test2 extends Thread{

	
	
	public void run() {
		
		System.out.println("Run :"+Thread.currentThread().getName());
			this.m1();
	}
	public void m1() {
			System.out.println("m1 :"+Thread.currentThread().getName());
			
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2() ;
		System.out.println("main :"+Thread.currentThread().getName());
		
//		t.m1();
		t.setName("manu");
		t.start();
			
	}

	

}
