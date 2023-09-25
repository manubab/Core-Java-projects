package maccess;

import java.util.*;
import test.*;

public class Product_Demo {
	@SuppressWarnings({ "unchecked", "removal" })
	public static void main(String[] args) {
		ArrayList<Integer> ob1=new ArrayList<Integer>();
		ArrayList<String> ob2=new ArrayList<String>();
		ArrayList<Product> ob3=new ArrayList<Product>();
		ob1.add(new Integer(15));
		ob1.add(new Integer(13));
		ob1.add(new Integer(14));
		System.out.print("Before Sorting ....!\n");
		ob1.forEach((k)->{
			System.out.println(k+" ");
		});
		Collections.sort(ob1);
		System.out.print("After Sorting ....! "
				+ "");
		ob1.forEach((k)->{
			System.out.print(k+" ");
		});
		ob2.add(new String("Cat"));
		ob2.add(new String("Apple"));
		ob2.add(new String("Bat"));
		System.out.println("\nBefore Soting...!");
		System.out.println(ob2.toString());
		Collections.sort(ob2);
		System.out.println(ob2.toString());
		System.out.println(" Before Soting ");
		System.out.println("**** Products ****");
		ob3.add(new Product("A121","Mouse",200,20));
		ob3.add(new Product("A123","SRD",410,10));
		ob3.add(new Product("A143","CDR",340,14));
		ob3.forEach((k)->{
			System.out.println(k);
		});
		Collections.sort(ob3);
		System.out.println(" After Soting ");
		
		ob3.forEach((k)->{
			System.out.println(k);
		});
	}

}
