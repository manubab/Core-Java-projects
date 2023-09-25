package maccess;
import java.util.*;
import java.util.function.*;
import test.EmpValues;
public class DemoMap2 {
	public static void main(String[] args) {
		Map<String,EmpValues> map=
	
	Map.of("A121",new EmpValues("manu","Se",13000),
				"A122",new EmpValues("Radha","TE",15000),
				"A123",new EmpValues("Sai","Sap",25000));
		
		System.out.println("----Map Data----");
	   map.forEach((k,v)->System.out.println(k+"\t"+v));	   
	   BiPredicate<String,EmpValues> bp=(x,y)->y.totalSal<45000;
		
		System.out.println("----Map Data Condition based----");
		map.forEach((x,y)->{
			if(bp.test(x,y))
			{
				System.out.println(x+"\t"+y);
			
				
				
				
			}
		});

	}
	
	
}
