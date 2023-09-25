package maccess;
import java.util.*;

public class IsLands 
{
	
	public static List<List<Integer>> islands(int numbers)
	{
		List<List<Integer>> triangle=new ArrayList<>();
		
		if(triangle.size()==0)
		{
			return triangle;
		}
		
		List<Integer> first_row=new ArrayList<>();
	  first_row.add(1);
		triangle.add(first_row);
		
		for(int i=1;i<numbers;i++)
		{
			List<Integer> prev_row=triangle.get(i-1);
			List<Integer> row=new ArrayList<>();
			row.add(1);
			
			for(int j=1;j<i;j++)
			{
				row.add(prev_row.get(j-1)+prev_row.get(j));
				
			}
			row.add(1);
			triangle.add(row);
			
			System.out.println(triangle.toString());
			
		}
		return triangle;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println(islands(5));
		
		
	}

}
