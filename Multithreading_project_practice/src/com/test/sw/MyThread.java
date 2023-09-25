package com.test.sw;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) 
		System.out.println("Run :"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
	//	mt.run();
		mt.setName("manu");
		
		for(int i=1;i<=10;i++) 
			System.out.println("Run :"+Thread.currentThread().getName());
			
		
	}

}
