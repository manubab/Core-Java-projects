package maccess;
import java.util.*;
import java.io.*;
public class DemoFile5 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("output.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			String data="Hello ";
			bw.write(data);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
