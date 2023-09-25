package Practice;

import java.util.*;
import java.util.stream.*;


public class FlatMap
{
	public static void main(String[] args) {
		
		List<String> proudctlist1=Arrays.asList("Printer","Mouse","KeyBoard","MotherBoard");  
		List<String> proudctlist2=Arrays.asList("Scanner","Projecter","Light Pen");
		
		
		List<String> proudctlist3=Arrays.asList("Pen Drive","Charger","Wifi adapter","Cooling fan");

		List<String> proudctlist4=Arrays.asList("Cpu Cabinet","Webcam","Usb Light","Michrophne","Power cable");
		
		List<List<String>> ob=new ArrayList<List<String>>();

		ob.add(proudctlist1);
		ob.add(proudctlist2);
		ob.add(proudctlist3);
		ob.add(proudctlist4);
		
		List<String> listOfAllProducts=new ArrayList<String>();
		
		for(List<String> pro:ob)
		{
			for(String product:pro)
			{
				listOfAllProducts.add(product);
			}
		}
		
//		System.out.println(listOfAllProducts);
//		System.out.println();
//		
		
		List<String> flatMapList=ob.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		
		System.out.println(flatMapList);
		
		
		

	}

}
