package maccess;
public class Demo_StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("==============================");
		
		System.out.println("****StringBuffer****");
		
		System.out.println("default capacity : "+sb.capacity());
		System.out.println("length : "+sb.length());
//		adding data to append();
	    sb.append("java"+" ");
	    System.out.println("default capacity : "+sb.capacity());
		System.out.println("length : "+sb.length());
		sb.append("program");
		System.out.println("default capacity : "+sb.capacity());
		System.out.println("length : "+sb.length());
		sb.append("language");
		System.out.println("default capacity : "+sb.capacity());
		System.out.println("length : "+sb.length());
		
		
	}

}
