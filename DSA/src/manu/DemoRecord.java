package manu;
import java.util.*;
record  ManuRecord(double tid,long hAccno,long bAccno,float amt,java.util.Date dTime)
{
	public ManuRecord
	{
		if(amt<=0)
		{
			throw new IllegalArgumentException("Invalid amt");
		}
		
	}
}

public class DemoRecord
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try(sc;)
		{
			try
			{
				System.out.println("Enter the hAccno");
				long hAccno=Long.parseLong(sc.nextLine());
				System.out.println("Enter the bAccno");
				long bAccno=Long.parseLong(sc.nextLine());
				System.out.println("Enter the Amount:");
				float amt=Float.parseFloat(sc.nextLine());
				
				//immutable object
				
				ManuRecord mr=new ManuRecord(Math.random(),hAccno,bAccno,amt,new Date());                                            
				
				System.out.println("Transection id :"+mr.tid());
				System.out.println("HAccno :"+mr.hAccno());
				System.out.println("BAccno :"+mr.bAccno());
				System.out.println("Amount :"+mr.amt());
				System.out.println("Date Time:"+mr.dTime());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
}

