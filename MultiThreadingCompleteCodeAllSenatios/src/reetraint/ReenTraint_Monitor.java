package reetraint;

public class ReenTraint_Monitor
{
	
	
	
	public synchronized void m()
	{
		
		n();
		
		System.out.println("this is m() ");
	}
	
	public synchronized void n()
	{
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
	}
	
}
