package syn;
//                 a block which contains synchronized  keyword          
//


class Institute3{
	 public void clasRoom(String fn) {
		 synchronized(Institute3.class) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+". class Taking by "+fn);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		 }
	
	}
}

class MyThread3 extends Thread{
	Institute3 ins;
	String fn;
	
	public void run() {
		ins.clasRoom(fn);
	}
	public MyThread3(Institute3 ins,String fn) {
		this.ins=ins;
		this.fn=fn;
		
		
		
	}
}
public class Test3 {
	public static void main(String[] args) {
		Institute3 ins1=new Institute3();
		Institute3 ins2=new Institute3();
		
		MyThread3 mt1=new MyThread3(ins1,"manu");
		MyThread3 mt2=new MyThread3(ins2,"Manohar");
		mt1.start();
		mt2.start();
		
		
	}
	
	

}
