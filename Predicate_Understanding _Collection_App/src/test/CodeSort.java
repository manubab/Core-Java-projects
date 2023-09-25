package test;

import java.util.Comparator;

public class CodeSort implements Comparator {

	
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.pQty-p2.pQty;
	}

}
