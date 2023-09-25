package maccess;
import java.io.*;
import java.util.*;

public class Demofile6 {

	public static void main(String[] args) {
		
		try {
			FileReader reder =new FileReader("Output.txt");
			int c;
			
			while((c=reder.read())!=-1)
			{
				System.out.println((char)c);
			}
			reder.close();
			
		}catch(Exception e)
		{
			
		}

	}

}
