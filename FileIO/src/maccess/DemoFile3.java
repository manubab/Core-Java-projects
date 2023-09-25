package maccess;
import java.util.*;
import java.io.*;
public class DemoFile3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User ob=new User("Manu",6301514150l,new Date());
		System.out.println("Enter the Destination Address");
		File f=new File(sc.nextLine());
		try {
			FileOutputStream fos=new FileOutputStream(f);
			try {
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				
				oos.writeObject(ob);
				
				System.out.println("Object Data Add succesfully to file....!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
  
	}

}
