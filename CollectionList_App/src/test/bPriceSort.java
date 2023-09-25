package test;
import java.util.*;
public class bPriceSort implements Comparator {

	public int compare(Object o1, Object o2) {
		BookDetails ob1=(BookDetails)o1;
		BookDetails ob2=(BookDetails)o2;
		
	if(ob1.bPrice==ob2.bPrice)
	{
		return 0;
		
	}else if(ob1.bPrice>ob2.bPrice)
		return 1;
	else return -1;
	
		
		
		
	}

}
