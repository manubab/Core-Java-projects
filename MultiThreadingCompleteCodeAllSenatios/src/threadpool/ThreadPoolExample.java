package threadpool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {

	private String taskName;

	public Tasks(String s) {
		taskName = s;

	}

	public void run() {
		try {

			for (int j = 1; j <= 5; j++) {
				if (j == 0) {
					Date dt = new Date();

					SimpleDateFormat sdf = new SimpleDateFormat("hh: mm :ss");

					System.out.println("initialization task name: " + taskName + sdf.format(dt));
				} else {

					Date dt = new Date();

					SimpleDateFormat sdf = new SimpleDateFormat("hh: mm :ss");

					System.out.println("Time if excecution for the task name: " + taskName + sdf.format(dt));

				}
			}
			
			Thread.sleep(1000);
			
			System.out.println(taskName +" is completed");

		} catch (Exception r) {
			
			r.printStackTrace();
		}

	}
}

public class ThreadPoolExample
{
	
	static final int MAX_TH=3;
	
	
	public static void main(String[] args) {
		
		
		Runnable r1=new Tasks("task-1");
		Runnable r2=new Tasks("task-2");
		Runnable r3=new Tasks("task-3");
		Runnable r4=new Tasks("task-4");
		Runnable r5=new Tasks("task-5");
		
		
		ExecutorService pl=Executors.newFixedThreadPool(MAX_TH);
		
		pl.execute(r1);
		pl.execute(r2);
		pl.execute(r3);
		pl.execute(r4);
		pl.execute(r5);
		
		
		pl.shutdown();
		
		
	}
	

}
