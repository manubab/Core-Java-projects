package maccess;
import test.*;
import java.util.*;
public class Demo_Ref3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StringBuilder sb=new StringBuilder();
		
		Test1 t1=new Test1(sb);
		Test2 t2=new Test2(sb);
		
		t1.writer(sc);
		t2.read();
		
	
	}

}
