package test1;
public class Withdraw implements Transection  {
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Amt withdraw"+amt);
			b.bal=b.bal-amt;
			System.out.println("Balence :"+b.getBalence());
			System.out.println("transection completed...!");
		}else {
			System.out.println("insufficinet funds...!");
		}
		
		
	}

}
