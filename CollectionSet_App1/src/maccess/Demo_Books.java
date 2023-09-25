package maccess;
import test.Book;
import java.util.*;
public class Demo_Books {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;)
		{
			try {
				Set<Book> b=null;
				String nm=null;
				while(true)
				{
					System.out.println("---choice----");
					System.out.println("\t1.HashSet"
							+ "\n\t2.LinkedHashSet"
							+ "\n\t3.TreeSet"
							+ "\n\t4.exit");
					System.out.println("Enter choice :");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						b=new HashSet<Book>();
						nm="HashSet";
						break;
					case 2:
						b=new LinkedHashSet<Book>();
						nm="LinkedHashSet";
						break;
					case 3:
						b=new TreeSet<Book>();
						nm="TreeSet";
						
						break;
					case 4:
						System.out.println("Set opretion on Stoped "+nm);
						System.exit(0);
						break;
					default:
						System.out.println("invalid choice..!");
						continue;
					}
					x:
					while(true)
					{
						System.out.println("Perform operations on "+nm+"\n");
						System.out.println("------ opertion Choices----");
						System.out.println("\t1.add(e)\n\t2.remove\n\t3.exit");
						System.out.println("Enter your choice :");
						switch(Integer.parseInt(s.nextLine()))
						{
						case 1:
							System.out.println("Enter bName");
							String bname=s.nextLine();
							System.out.println("Enter bauthor");
							String bauthor=s.nextLine();
							System.out.println("Enter bprice");
							float bprice=Float.parseFloat(s.nextLine());
							System.out.println("Enter bqty");
							int qty=Integer.parseInt(s.nextLine());
							b.add(new Book(bname,bauthor,bprice,qty));
							System.out.println(" book added succesfully ");
							Spliterator<Book> sp=b.spliterator();
							sp.forEachRemaining((k)->{
								System.out.println(k.toString());
							});
							
							break;
						case 2:
							if(b.isEmpty()) {
							   System.out.println("Set is empty...!");
							   
							}else {
								System.out.println("Enter Soting String :");
								String bns=s.nextLine();
								boolean f=false;
								Iterator<Book> it=b.iterator();
								while(it.hasNext()) {
									Book b1=it.next();
								if(bns.equals(b1.bname.substring(1, 2)))
								{
									f=true;
									it.remove();
									System.out.println("Object remoived succesfully");
									break;
								}
								}
								if(!f) {
									System.out.println("Invalid bname Sorted Code..!");
								}
								it.forEachRemaining((k)->{
									System.out.println(k.toString());
								});
							}
							break;
						case 3:
							System.out.println("Stop the operations on "+nm);
							break x;
							default:
								System.out.println("Invalid Choice...!");
						}
					}
				}
			}// inner try close
			catch(Exception e)
			{
				e.printStackTrace();
			}//catch closed
		}//outer try close 
	}

}
