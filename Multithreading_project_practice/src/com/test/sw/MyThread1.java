package com.test.sw;

public class MyThread1 implements Runnable {
	
	public void run() {
		for(int i=1;i<=10;i++)
		System.out.println(i+"Run :"+Thread.currentThread().getName());
			
	}
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
//		mt1.setName("Manu ");

		MyThread mt2=new MyThread();
//		mt2.setName("Nana ");
		
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		
		t1.start();
		t2.start();


		
	}


}
