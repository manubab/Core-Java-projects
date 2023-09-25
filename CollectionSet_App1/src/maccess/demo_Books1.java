package maccess;
import java.util.*;
import test.*;
public class demo_Books1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			try {
				Set<Book1> ob=null;
				String name=null;
				
				while(true)
				{
					System.out.println("------- choice -----");
					System.out.println("\t1.HashSet\n\t2.LinkedHashSet\n\t3.TreeSet\n\t4.exit");
					System.out.println("Enter Choice");
				   switch(Integer.parseInt(sc.nextLine())) {
				  
				   case 1:
					  
					   ob=new HashSet<Book1>();
					   name="HashSet";
					   break;
				   case 2:
					   ob=new LinkedHashSet<Book1>();
					   name="LinkedHashSet";
					   break;
				   case 3:
					   ob=new TreeSet<Book1>();
					   name="TreeSet";
					   break;
				   case 4:
					   System.out.println("Set<E> Elements operations Stoped");
					   System.exit(0);
					   break;
				   default:
					   System.out.println("invalid choice...!");
				   }
				   x:
					   while(true)
					   {
						   System.out.println("\n"+name+"Based on operations");
						   System.out.println("------choice------");
						   System.out.println("\t1.add(E)\n\t2.remove(Object)\n\t3.exit");
						   System.out.println("Enter choice :");
						   
						   
						   switch(sc.nextInt())
						   {
						   case 1:
							   sc.nextLine();
							   System.out.println("Enter BName :");
							   String Bname=sc.nextLine();
							   System.out.println("Enter Bauthor :");
							   String Bauthor=sc.nextLine();
							   System.out.println("Enter BPrice :");
							   Float BPrice=Float.parseFloat(sc.nextLine());
							   System.out.println("Enter BQty :");
							   Float BQty=Float.parseFloat(sc.nextLine());
							   
							   ob.add(new Book1(Bname,Bauthor,BPrice,BQty));
							   System.out.println("Object Added Succesfully ");
							   ob.forEach((k)->{
								   System.out.print(k.toString());
							   });
							   break;
						   case 2:
							 
							   if(ob.isEmpty()) {
								   System.out.println("Set Object is Empty");
							   }else {
								   System.out.println("Enter object price");
								   Float Bprice=sc.nextFloat();
								   boolean b=false;
								   Iterator<Book1>it=ob.iterator();
								   while(it.hasNext())
								   {
									   Book1 b2=it.next();
									   if(Bprice.equals(b2.bprice))
									   {
										   b=true;
										   it.remove();
										   System.out.println("Object removed Succesfully");
										  break;
										   
										  
									   }
								   }
								   if(b==false)
								   {
									   System.out.println("invalid Book Price");
								   }
									  
								   it.forEachRemaining((k)->{
									   System.out.println(k.toString());
								   });
							   }
							   break;
						   case 3:
							   System.out.println("Operations Stoped on "+ name);
							   break x;
							   default:
								   System.out.println("invallid Choice");
						   }
						   
					   }//loop closed
					
				}//loop closed
				
			}//inner try close
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}//try closed
	}

	

}
