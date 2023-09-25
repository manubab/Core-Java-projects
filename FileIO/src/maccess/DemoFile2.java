package maccess;

import java.util.*;
import java.io.*;

public class DemoFile2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (sc;) {
			try {
				System.out.println("Enter file Address :");

				File f1 = new File(sc.nextLine());
				if (f1.exists()) {
					FileInputStream fis = new FileInputStream(f1);
					System.out.println("Enter Destnation address ");
					File f2 = new File(sc.nextLine());
					FileOutputStream fos = new FileOutputStream(f2);

					int k;
					while ((k = fis.read()) != -1) {
						fos.write(k);

					}
					System.out.println("File Coppyed Sucessfully....!");
					fis.close();
					fos.close();

				} else {
					System.out.println("invalid file");
				}

			} catch (Exception e) {
				System.err.println("Invalid fPath or fName...!");
			}
		}

	}

}
