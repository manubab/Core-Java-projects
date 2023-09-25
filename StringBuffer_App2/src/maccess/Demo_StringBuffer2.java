package maccess;

import java.util.*;

public class Demo_StringBuffer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (true) {
			System.out.println("Enter the choice : ");
			System.out.println(
					"\n\t1.append()" + "\n\t2.insert()" + "\n\t3.delete()" + "\n\t4.reverse()" + "\n\t5.exit()");
			System.out.println("Enter the choice ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				System.out.println("Enter the String : ");
				sb.append(sc.nextLine() + " ");
				System.out.println(sb.toString());
				break;
			case 2:
				if (sb.length() == 0) {
					System.out.println("Buffer is empty....");
				} else {
					System.out.println("Enter the index where to be inserted.....");
					int i1 = Integer.parseInt(sc.nextLine());
					if (i1 >= 0 && i1 <= sb.length() - 1) {
						System.out.println("Enter the String data : ");
						sb.insert(i1, sc.nextLine() + " ");
						System.out.println(sb.toString());

					} else {
						System.out.println("invalid index...");
					}
				}
				break;
			case 3:
//				delete operation 
				System.out.println("Enter the start index : ");
				int si = Integer.parseInt(sc.nextLine());
				if (si >= 0 && si <= sb.length() - 1) {
					System.out.println("Enter the endindex : ");
					int ei = Integer.parseInt(sc.nextLine());
					if (ei >= 0 && ei <= sb.length() - 1) {
						sb.delete(si, ei);
						System.out.println(sb.toString());

					} else {
						System.out.println("invalid index..");
					}

				} else {
					System.out.println("invalid index....");
				}

				break;
			case 4:
//				reverse data ;
				if (sb.length() == 0) {
					System.out.println("Buffer is empty ....");
				}
				sb.reverse();
				System.out.println(sb.toString());

				break;
			case 5:
				System.out.println("operation stopped on the buffer .....");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice...");
			}
		}
	}

}
