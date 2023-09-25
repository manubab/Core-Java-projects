package String_Practice;
import java.io.*;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		String a="I am a Indian I am love Indian";
		int n=a.length();
		String w="";
		String nw="";
		
	String arr[]=a.split(" ");
		
		Set<String> myset =new LinkedHashSet<String>();
		for(String s:arr)
		{
			myset.add(s);
		}
		
		System.out.println(myset);
		
	}

}
