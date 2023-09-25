package maccess;
import java.util.*;
import java.io.*;
public class DemoFile7 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Output.txt");
			String data="Hello mama";
			fw.write(data);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
