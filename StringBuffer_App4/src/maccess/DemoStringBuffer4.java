package maccess;
public class DemoStringBuffer4 {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("nit");
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("***sb1***");
		System.out.println("sb1 : "+sb1.toString());
		System.out.println("***sb2***");
		System.out.println("sb2 :"+sb2.toString());
		
		sb2.reverse();
		
		System.out.println("***sb1***");
		System.out.println("sb1 : "+sb1.toString());
		System.out.println("***sb2***");
		System.out.println("sb2 :"+sb2.toString());
		
		System.out.println("***sb2 Capacity and length****");
        
		System.out.println("Capacity : "+ sb2.capacity());
		
		System.out.println("Length : "+ sb2.length());
  	}

}
