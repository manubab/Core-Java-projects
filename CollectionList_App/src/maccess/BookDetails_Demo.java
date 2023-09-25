package maccess;
import java.util.*;
import test.*;
import test.BookDetails;
public class BookDetails_Demo {
	public static void main(String[] args) {
		ArrayList<BookDetails> al=new ArrayList<BookDetails>();
		Scanner sc=new Scanner(System.in);
		System.out.println("*** Book Details ***");
		while(true) 
		{
			System.out.println("---Choice----");
			System.out.println("\t1.add"
					+ "\n\t2.sort()"
					+ "\n\t3.exit");
			System.out.println("Enter choice :");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println("Enter BookCode");
				String bCode=sc.nextLine();
				System.out.println(" Enter BookName");
				String bName=sc.nextLine();
				System.out.println("Enter BookAuthor");
				String bAuthor=sc.nextLine();
				System.out.println("Enter BookPrice");
				float bPrice=Float.parseFloat(sc.nextLine());
				System.out.println("BookQty");
				int bQty=Integer.parseInt(sc.nextLine());
				al.add(new BookDetails(bCode,bName,bAuthor,bPrice,bQty));
				System.out.println("object Added Succesfully....!");
				al.forEach((k)->{
					System.out.println(k);
				});
				break;
			case 2:
				xyz:
				while(true)
				{
					System.out.println("---Choices-----");
					System.out.println("\t1.bCodeSort"
							+ "\n\t2.bNameSort"
							+ "\n\t3.bAuthorSort"
							+ "\n\t4.bPriceSort"
							+ "\n\t5.bQtySort"
							+ "\n\t6.exitSort");
					System.out.println("Enter Choice  :");
					switch(Integer.parseInt(sc.nextLine()))
					{
					case 1:
						al.sort(new bCodeSort());
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 2:
						al.sort(new bNameSort());
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 3:
						al.sort(new bAuthorSort());
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 4:
						al.sort(new bPriceSort());
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 5:
						al.sort(new bQtySort());
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					case 6:
						System.out.println("Operation Stoped....!");
						break xyz;
					
						default:
							System.out.println("invalid choice...!");
					}
				}
			break;
			case 3:
				System.out.println("Operation stopped");
				System.exit(0);
			
				break;
				default:
					System.out.println("invalid choice....!");
			}
		}
	}

}

















