package maccess;
import test.User;
public class ObjectDemo1 {
	public static void main(String [] args)
	{
	     Integer ob1=new Integer(12);
	     String ob2=new String("NIT-HYD");
	     
	     User ob3=new User("ram","ram@gmail.com");
	     
	     System.out.println("**** Displaying Object Data ****");
	     
	     System.out.println(ob1.toString());
	     System.out.println(ob2.toString());
	     System.out.println(ob3.toString());
	     
	     System.out.println("**** Printing hashCode () ****");
	     
	     System.out.println(ob1.hashCode());
	     System.out.println(ob2.hashCode());
	     System.out.println(ob3.hashCode());
	}

}
