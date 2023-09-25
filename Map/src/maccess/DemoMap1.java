package maccess;
import java.util.*;
public class DemoMap1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> m=null;
		String nm=null;
		try(sc;)
		{
			try {
				while(true) {
				System.out.println("------Choices------");
				System.out.println("\t1.HashMap\n\t2.LinkedLashMap\n\t3.TreeMap\n\t4.Hashtable\n\t5.exit");
				System.out.println("Ente choice :");
				
				switch(sc.nextInt())
				{
				case 1:
					m=new HashMap<Integer,String>();
					nm="HashMap";
					break;
				case 2:
					m=new LinkedHashMap<Integer,String>();
					nm="LinkedHashMap";
					break;
				case 3:
					m=new TreeMap<Integer,String>();
					nm="TreeMap";
					break;
				case 4:
					m=new Hashtable<Integer,String>();
				    nm="Hashtable";
					break;
				case 5:
					
					System.out.println("Operation Stoped on Map ....!");
					System.exit(0);
					default:
						System.out.println("invalid Choice ...!");
					
				}
				x:
				while(true)
				{
					System.out.println("----------Choices---------");
					System.out.println("");
				}
				
				
				}//loop close
				
			}//try close
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}// resource Close
	}

}
