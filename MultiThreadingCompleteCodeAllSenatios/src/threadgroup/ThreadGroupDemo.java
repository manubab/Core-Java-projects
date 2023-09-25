package threadgroup;

public class ThreadGroupDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();

		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, threadGroupDemo, "one");

		t1.start();

		Thread t2 = new Thread(tg1, threadGroupDemo, "two");
		t2.start();

		Thread t3 = new Thread(tg1, threadGroupDemo, "three");
		t3.start();
		
		System.out.println("Thread Group Name :"+tg1.getName());
		
		tg1.list();

	}

}
