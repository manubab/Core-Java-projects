package test;
import java.util.*;

public class Reader {
	public StringBuffer sb=null;
	public Reader(StringBuffer sb) {
		this.sb=sb;
	}
	public void read() {
		System.out.println("==Data From Buffer==");
		System.out.println(sb.toString());
	}

}
