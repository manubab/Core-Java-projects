package maccess;
public class Lambda {
	public static void main(String[] args) {
		Runnable r=new Runnable()
				{
		public void run() {
			for(int i=0;i<=5;i++)
				{
				System.out.println("Runnable Thread...!");
					try {
					Thread.sleep(1000);
					}
					catch(Exception e){
						
						e.printStackTrace();
					}	
				}
			}
				};
		Runnable r2=()->System.out.println(" Runnable smart one");
		
		
		new Thread(()->System.out.println("Thread Manu")).start();;

	}

}
