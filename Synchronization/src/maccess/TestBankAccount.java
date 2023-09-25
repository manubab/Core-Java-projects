package maccess;

class BankAccount{
	public  static int balence;
	public BankAccount(int b)
	{
		balence=b;
	}
	
	public BankAccount()
	{
		balence=0;
	}
	public static int getBalence()
	{
		return balence;
	}
	public static int withDraw(int w)
	{
		int b=getBalence();
		
		if(w<=b)
		{
			balence=balence-w;
			return w;
		}
		else
		{
			return 0;
		}
			
		
	}
	
}



class WithDrawAccount implements Runnable{
	public BankAccount acc;
	public int amount;
	
	public WithDrawAccount()
	{
		acc=null;
		amount=0;
	}
	public WithDrawAccount(BankAccount acc,int amount)
	{
		this.acc=acc;
		this.amount=amount;
		
	}
	public void run()
	{
		int w;
		
		for(int i=0;i<5;i++)
		{
			try {
			Thread.sleep(1200);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
			System.out.println("Balence before :"+Thread.currentThread().getName()+acc.getBalence());
			w=acc.withDraw(amount);
			System.out.println("After withDraw :"+Thread.currentThread().getName()+acc.getBalence());
			
		}
	}
	
	
}


public class TestBankAccount {
	
	public static void main(String[] args) {
		BankAccount b=new BankAccount(1000);
		WithDrawAccount w=new WithDrawAccount(b,10);
		
		Thread t1=new Thread(w);
		t1.setName("Manu  ");
		t1.start();

		Thread t2=new Thread(w);
		t2.setName("Sai  ");
		t2.start();

		
		
	}

}
