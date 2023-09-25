package maccess;
import java.util.*;
public class Demo_Collection_1 {
	
	public static void main(String[] args) {
		
		Set<Integer> ob=null;
		String nm=null;
		Scanner sc=new Scanner(System.in);
		try(sc;) {
			try {
	while(true) {
		System.out.println("======= choice=====");
		System.out.println("\t1.HashSet\n\t2.LinkedHashSet\n\t3.TreeSet\n\t4.exit");
		System.out.println("Enter choice  :");
		
		switch(sc.nextInt()) {
		case 1:
			ob=new HashSet<Integer>();
			nm="HashSet<E>";
			break;
		case 2:
			ob=new LinkedHashSet<Integer>();
			nm="LinkedHashSet<E>";
			break;
		case 3:
			ob=new TreeSet<Integer>();
			nm="TreeSet<E>";
			break;
		case 4:
			System.out.println("exit application");
			System.exit(0);
		default:
			System.out.println("invalid choice....!");
			continue;
			
		}
		x:
		while(true) {
			System.out.println("=========choice =======");
			System.out.println("\t1.add(Elements)\n\t2.remove(element)");
			
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter element :");
				Integer a=new Integer(sc.nextInt());
				ob.add(new Integer(a));
				System.out.println(nm+"Elements :"+ob.toString());
				
				break;
			case 2:
				
			 if(ob.isEmpty()) {
				 System.out.println(nm+"Set<E> is empty...!");
			 }else {
				 System.out.println("Enter removed elements  :");
				 Integer b=new Integer(sc.nextInt());

				 if(ob.contains(b)) {
					 ob.remove(b);
					 System.out.println(nm+"removed element successfully..! ");
					 System.out.println(ob.toString());
				 }else {
					 System.out.println("Element not avilable...!");
				 }
			 }
			
			case 3:
				System.out.println("operation on "+nm+"Stopped");
				break x;
				default:
					System.out.println("invalid choice....!");
					
				
			}
		}//inner loop end
		


	}//loop end
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		
		}
		
		
	}

}
