package maccess;
import java.util.*;
public class DemoStack {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			
			try {
				Stack<Integer> ob=new Stack<Integer>();
				while(true) {
					
					System.out.println("--------Choice-----");
					System.out.println("\t1.push(element)\n\t2.pop(element)\n\t3.peek(element)\n\t4.search(Element)\n\t5.exit(application)");
					System.out.println("Enter choice :");
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter Element :");
						ob.push(new Integer(sc.nextInt()));
						System.out.println(ob.toString());
						break;
					case 2:
					      if(ob.empty()) {
					    	  System.out.println("Stack is Empty...!");
					      }else {
					    	  ob.pop();
					    	  System.out.println(ob.toString());
					      }
						break;
					case 3:
						if(ob.isEmpty())
						{
							System.out.println("Stack is Empty....!");
							
						}else
						{
						System.out.println(	ob.peek());
							System.out.println(ob.toString());
							
						}
						
						break;
					case 4:
						if(ob.empty()) {
							System.out.println("Stack is Empty...!");
						}else {
							System.out.println("Enter Element :");
							int ele=sc.nextInt();
							int p=ob.search(ele);
							if(p>0) {
								System.out.println("Element found :"+p);
							}else {
								System.out.println("element not found");
							}
						}
						
						break;
					case 5:
						System.out.println("Stoped the Application ...!");
						System.exit(0);
						
						break;
						default:
							System.out.println("Invalid choice....!");
					}
					
							
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}//resource close
		

	}

}
