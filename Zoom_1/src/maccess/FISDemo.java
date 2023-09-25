package maccess;
import java.io.*;
public class FISDemo {

	public static void main(String[] args) 
			throws IOException,FileNotFoundException{
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		fos.write(123);
		fos.flush();
		System.out.println("Sucessfully Addedd...!");
		
		FileInputStream fis=new FileInputStream("abc.txt");
         
	int data=	fis.read();
	System.out.println("Data :"+data);

		
		
		fos.close();
		fis.close();
		

	}

}
