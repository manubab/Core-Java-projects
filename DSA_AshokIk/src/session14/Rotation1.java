package session14;

public class Rotation1 
{
	public static void main(String[] args) {
		
		
		int n = 3;
		int m = 4;

		int[][] array = {
		        {11, 12, 13, 14},
		        {21, 22, 23, 24},
		        {31, 32, 33, 34}};

		
		
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
