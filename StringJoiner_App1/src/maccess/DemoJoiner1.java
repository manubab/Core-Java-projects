package maccess;
import java.util.*;
public class DemoJoiner1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringJoiner ob1=new StringJoiner("/");
		ob1.setEmptyValue("Joiner is empty");
		System.out.println("Joiner : "+ob1.toString());
		ob1.add("12");
		ob1.add("10");
		ob1.add("1998");
		System.out.println("DOJ : "+ob1.toString());
 
		StringJoiner ob2=new StringJoiner("-");
		ob2.add("HYD");
		ob2.add("TS");
		ob2.add("500038");
		
		System.out.println("Address : "+ob2.toString());
		ob1.merge(ob2);
		System.out.println("Length : "+ob1.length());
		
		System.out.println("Merge : "+ob1.toString());
	    sc.close();
	}

}
