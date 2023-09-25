package practice;
import java.util.*;
public class Find_Amstrong_Numbrers_in_A_Range {
	public static void main(String[] args) {
	    int n;
	    int ams=0;
	    for(int i=1;i<1000;i++)
	    {
	    	n=i;
	    	
	    	while(n>0)
	    	{
	    		int k=n%10;
	    		ams=ams+(k*k*k);
	    		n=n/10;	
	    	}
	    	if(ams==i)
	    	{
	    		System.out.println(i+" ");
	    	}
	    	ams=0;
	    }

	    }

	

}
