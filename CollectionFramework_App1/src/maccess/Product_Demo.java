package maccess;
import java.util.*;
import test.Product;
public class Product_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				Set<Product> ob=null;
				String nm=null;
				while(true) {
				System.out.println("----------------Choice-----------");
				System.out.println("\t1.HashSet\n\t2.LinkedHashSet\n\t3.TreeSet\n\t4.exit");
				System.out.println("Enter choice :");
				switch(Integer.parseInt(sc.nextLine())) {
				case 1:
					ob=new HashSet<Product>();
					nm="HashSet";
					break;
				case 2:
					ob=new LinkedHashSet<Product>();
					nm="LinkedHashSet";
					break;
				case 3:
					ob=new TreeSet<Product>();
					nm="Treeset";
					break;
				case 4:
					System.out.println("Set operation stopped...");
				System.exit(0);
				default:
					System.out.println("invalid choice....!");
					continue;
					
				}
				x:
				while(true) {
					System.out.println("\n operations performed on "+nm);
					System.out.println("----Choice----");
					System.out.println("\t1.add(Product)\n\t2.remove(Product)\n\t3.exit");
					System.out.println("Enter choice");
					
					switch(Integer.parseInt(sc.nextLine())) {
					case 1:
						System.out.println("Read Product details   :");
						System.out.println("Enter product code :");
						String pcode=sc.nextLine();
						System.out.println("Enter product PName :");
						String name=sc.nextLine();
						System.out.println("Enter product Price :");
						float price=Float.parseFloat(sc.nextLine());
						System.out.println("Enter product Qty :");
						int Qty=Integer.parseInt(sc.nextLine());
						ob.add(new Product(pcode,name,price,Qty));
						System.out.println("Product add Successfully...!");
						Spliterator<Product>sp=ob.spliterator();
						sp.forEachRemaining((k)->{
							System.out.println(k.toString());
						});
                        break;
					case 2:
						if(ob.isEmpty()) {
							System.out.println("Set is Empty");
							
						}else {
							System.out.println("Enter product code :");
							String pc=sc.nextLine();
							boolean f=false;
							Iterator<Product> it=ob.iterator();
						    while(it.hasNext()) {
						    	Product p=it.next();
						    	if(pc.equals(p.code)) {
						    		f=true;
						    		it.remove();
						    		System.out.println("Product removed Succcesfully...!");
						    		break;
						    		
						    	}
						    }
						    if(!f) {
						    	System.out.println("invalid product code..!");
						    }
						}
						ob.forEach((k)->System.out.println(k.toString()));
						break;
					case 3:
						System.out.println("Operation stopped on :"+nm);
						break x;
						default:
						System.out.println("invalid choice....!");
						
						
					}
				}
				}//outer loop closed
				
			}//inner try closed
			catch(Exception e)
			{
				e.printStackTrace();
			}// catch closed
		}//outer try closed

	}

}



































