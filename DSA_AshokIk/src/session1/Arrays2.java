package session1;

public class Arrays2
{
	public static void main(String[] args) {
		int n=8;
		int ar[]= {7,1,3,8,7,8,9,9};
		unique(ar,n);
		
		
	}
	private static void unique(int[] ar, int n) {
	  
		for(int i=0;i<n;i++)
		{
			int fre=0;
		
			for(int j=0;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					fre++;
				}
				
			}
			if(fre==1)
			{
				System.out.println(ar[i]);
			}else if(fre>1)
			{
				System.out.println(ar[i] +"  duplicate have there :"+ fre );
			}
			
		}
		
	}
	
	


	
	
	

}
