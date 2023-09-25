package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String messg;

	public WorkerThread(String s) {
		this.messg = s;

	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start message =" + messg);

		processMessage();

		System.out.println(Thread.currentThread().getName() + "end");

	}

	public void processMessage() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}
}

public class TestThreadPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 1; i <=10; i++) {
			Runnable or = new WorkerThread(" " + i);
			executorService.execute(or);
		}

		executorService.shutdown();

		while (!executorService.isTerminated()) {

		}
		System.out.println("Fininshed all threads");

	}

}
