package syn;

class Institute{
	synchronized public void classRoom(String facultyName) {
		for(int i=0;i<=10;i++) {
			System.out.println(i+".Class Taking by "+facultyName);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class MyThread extends Thread{
	
	Institute ins;
	String facultuName;
	
	public void run() {
		
		ins.classRoom(facultuName);
		
	}
	MyThread(Institute ins,String facultyName){
		this.ins=ins;
		this.facultuName=facultyName;
		
	}
	
}

public class Test extends Thread {
	
	public static void main(String[] args) {
		
		Institute ins=new Institute();
		
		MyThread mt1=new MyThread(ins,"manohar ");
		MyThread mt2=new MyThread(ins,"manu ");
		mt1.start();
		mt2.start();
		
	}


}
