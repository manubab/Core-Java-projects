package test;
import java.util.*;
public class bAuthorSort implements Comparator {

	public int compare(Object o1, Object o2) {
		BookDetails ob1=(BookDetails)o1;
		BookDetails ob2=(BookDetails)o2;
		
	int k=ob1.bAuthor.compareTo(ob2.bAuthor);
	if(k==0)return 0;
	else if(k>0)return 1;
	else return -1;
	
		
		
		
	}

}
