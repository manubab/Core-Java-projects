package com.test.sw;

public class MyThread2 extends Thread {
	
	public void run() {
		System.out.println("run :"+Thread.currentThread().getName());
	}
	public static void main(String[] args)throws IllegalThreadStateException
	{
		MyThread2 mt=new MyThread2();
		mt.setName("manu :");
		mt.start();
		mt.start();
		
		
	}

}
