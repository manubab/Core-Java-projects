package Practice;
import java.security.PKCS12Attribute;
import java.util.Scanner;
public class String_APP {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String_APP P=new String_APP("c language","java language ");
		
		String w="";
		
		String s1="java encapsulation every java program must be depend on oops ";
		String sub2=s1.replaceAll("oops", "");
		System.out.println("no need to oops"+ sub2);
	}
	
	
	
	public String_APP(String s,String r) {
		String sub=s.replace('c', 'l');
		System.out.println("ofter replace the data : "+sub);
		String sub2=r.concat("coders");
		System.out.println("After adding the data : "+ sub2);
	}

}
