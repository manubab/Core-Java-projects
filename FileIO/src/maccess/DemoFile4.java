package maccess;
import java.util.*;
import java.io.*;
public class DemoFile4 implements Serializable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file Address");
		File f=new File(sc.nextLine());
		try {
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		User ob=(User)ois.readObject();
		System.out.println(ob.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
