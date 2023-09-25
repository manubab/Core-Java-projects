package test;
import java.util.*;
public class bQtySort implements Comparator {

	public int compare(Object o1, Object o2) {
		BookDetails ob1=(BookDetails)o1;
		BookDetails ob2=(BookDetails)o2;
		
	if(ob1.bQty==ob2.bQty)
	{
		return 0;
	}else if(ob1.bQty>ob2.bQty)
		return 1;
	else return -1;
	
		
		
		
	}

}
