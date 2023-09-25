package test;

public class String_Array_to_String {
	public static void main(String[] args) {
String[] myarr=
				
				
{"the","quick","brown","fox","jumps",
		"over","the","lazy","dog"};


StringBuffer sb=new StringBuffer();
sb.append(myarr[0]);

for(int i=1;i<myarr.length;i++) {
	sb.append(" "+myarr[i]);
	
}

String s=sb.toString();

System.out.println(s);

		
	}
	
}
