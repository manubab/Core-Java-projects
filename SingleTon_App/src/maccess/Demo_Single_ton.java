package maccess;
import test.*;
public class Demo_Single_ton {
	public static void main(String[] args) {
		
		STest1 ob=STest1.getRef();
		System.out.println(ob);
	}
}
