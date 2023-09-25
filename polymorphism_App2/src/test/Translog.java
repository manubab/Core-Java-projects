package test;

import java.util.Date;

public record Translog(double tid,long hAccNo,long bAccNo,float amt,Date dTime)
{
	public Translog
	{
		if(amt<0) {
			throw new IllegalArgumentException("invalid amount...!");
			
		}
		
	}
	
	
	

}
