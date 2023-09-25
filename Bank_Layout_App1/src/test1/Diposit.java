package test1;
public class Diposit implements Transection{
	public void process(int amt) {
		System.out.println("Amt Diposited"+amt);
		b.bal=b.bal+amt;
		System.out.println("balence :"+b.getBalence());
	}

}
