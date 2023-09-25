package com.test.sw;

public class Test_Join extends Thread {
	
	static Thread p=null;
	
	Test_Join tj1=new Test_Join();


	@Override
	public void run() {
		for(int i=1;i<=10;i++)// 10 times
		System.out.println("run :"+Thread.currentThread().getName());
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e.toString());
//		}
//		
	}
	
	public static void main(String[] args)throws InterruptedException
	{
		Test_Join tj=new Test_Join();
		Thread.currentThread().getName();
		tj.setName("manu ");
		tj.start();
		//tj.join();
		
		
		for(int i=1;i<=10;i++)// 10 times
			System.out.println("main :"+Thread.currentThread().getName());
		
	}

}
