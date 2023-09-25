package maccess;
import test.*;
public class Demo_SingleTon2 {
	public static void main(String[] args) {
		STest2 ob=STest2.getRef();
		System.out.println("object :"+ob);
	}

}
