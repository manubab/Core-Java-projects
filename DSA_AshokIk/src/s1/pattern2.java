package s1;

public class pattern2
{
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				if((i==2)&&(j==4)||(i==2)&&(j==3)||(i==4&&j==3)||(i==3&&j==4)||i==3&&j==3)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
