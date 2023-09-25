package String_Practice;
import java.util.*;
public class Fing_Dublicate_Word_Retriveing {

//	public static void fingDublicate(String s) {
//		
//		Map<String,Integer> map=new HashMap<String,Integer>();
//		String[] s1=s.split(" ");
//		
//		for(String s2:s1)
//		{
//			if(!map.containsKey(s)) {
//				map.put(s2, 1);
//				
//			}else {
//				map.put(s2, map.get(s2)+1);
//			}
//		}
//		boolean b=false;
//		Set<String> set=map.keySet();
//	  
//		 for(String s2: set)
//		 {
//			 int totol=map.get(s2);
//			 if(totol>1) {
//				 System.out.println(s2+" "+totol);
//				 b=true;
//			 }
//		 }
//		
//	}
	
	
	public static void m1(String s) {
		String[] ns=s.split(" ");
		
		for(int i=0;i<ns.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ns.length;j++)
			{
				if(ns[i].equals(ns[j]))
				{
					count=count+1;
					System.out.println(ns[j]+"\t"+count);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls Enter a String");
		String s=sc.nextLine();
		
		if(s.trim().length()==0)
		{
			System.out.println("Pls enter valid String");
		}else
//			Fing_Dublicate_Word_Retriveing.fingDublicate(s);
		m1(s);
		
	}

}
