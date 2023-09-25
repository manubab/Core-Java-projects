package com.test.sw;

public class DeadLock extends Thread {
	static Thread mt=null;
	
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Run :"+Thread.currentThread().getName());
		try {
			mt.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("main :"+Thread.currentThread().getName());
		DeadLock d=new DeadLock();
		d.setName("King");
		mt=Thread.currentThread();
		d.start();
		mt.join();
		
		
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("Run :"+Thread.currentThread().getName());
			}
		
	}

}
