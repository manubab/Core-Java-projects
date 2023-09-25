package com.test.sw;

public class Test1 extends Thread {
	
	public void run() {
		
		System.out.println("run :"+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main :"+Thread.currentThread().getName());
		
		Test1 t=new Test1();
		
		//t.run();
		t.setName("manu");
		//System.out.println(t.getPriority());
		t.start();
		
	
		
	}

}
