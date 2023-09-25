package maccess;
import java.util.*;
import java.io.*;

public class DemoFile8 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			File f=new File("D:\\New folder\\Text.txt");
			FileWriter fw=new FileWriter(f);
			System.out.println("Enter text data @-end");
			char ch;
			
			while((ch=(char)br.read())!='@')
			{
				fw.write(ch);
			}
			fw.close();
			br.close();
			
			System.out.println("Data Stored Succesfully");
			
			System.out.println("------------Data from file---------");
			FileReader fr=new FileReader(f);
			
			int k;
			
			while((k=fr.read())!=-1)
			{
				System.out.print((char)k);
			}
			
			
		}
		catch(Exception e)
		{
			
		}

	}

}
