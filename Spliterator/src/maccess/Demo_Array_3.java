package maccess;
import test.*;
import java.util.*;
public class Demo_Array_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Employees");
		int n=Integer.parseInt(sc.nextLine());
		
		Employee[] ob=new Employee[n];
		
		for(int i=0;i<n;i++) {
			ob[i]=new Employee();
			
			System.out.println("Enter emp id :");
			ob[i].id=sc.nextLine();
			System.out.println("Enter empName :");
			ob[i].name=sc.nextLine();
			System.out.println("Enter empDesg :");
			ob[i].desg=sc.nextLine();
			System.out.println("Enter bsal :");
			ob[i].bsal=Integer.parseInt(sc.nextLine());
			
			ob[i].totsal=ob[i].bsal+(0.93F*ob[i].bsal)+(0.63F*ob[i].bsal);
			
		}// end of loop
		Spliterator<Employee> spl=Arrays.spliterator(ob);
		spl.forEachRemaining((o)->
		{
			System.out.println(o.toString());
			
		});
		sc.close();
	}

}
