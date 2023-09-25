package maccess;
import java.util.*;
import test.*;
public class DemoException3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("Enter value 1 :");
			int v1=sc.nextInt();
			System.out.println("Enter value 2 :");
			int v2=sc.nextInt();
			System.out.println("====choice===");
			System.out.println("\t1.Greater \n\t2.Smaller");
			System.out.println("Enter choice :");
			switch(sc.nextInt()) 
			{
			case 1:
				Greater ob=new Greater("");
				int r1=ob.comapareTo(v1, v2);
				System.out.println("Greater :"+r1);
				break;
			case 2:
				Smaller ob2=new Smaller("");
				int r2=ob2.comapareTo(v1, v2);
				System.out.println("Smaller :"+r2);
				break;
				default:
					System.out.println("invalid choice...!");
			}
			
		}
		catch(Greater  | Smaller ob2 )
		{
			System.out.println(ob2.getMessage());
			
		}
		catch(InputMismatchException ime) {
			System.out.println("Enter only Integer ...!");
			
		}
		finally {
			sc.close();
		}

	}

}
