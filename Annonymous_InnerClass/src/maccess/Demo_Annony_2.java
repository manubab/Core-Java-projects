package maccess;

import java.util.*;
import test.*;

public class Demo_Annony_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();

		System.out.println("====choice=====");
		System.out.println("\t1.Addtion" + "\n\t2.substraction" + "\n\t3.Multi"

				+ "\n\t4.Division" + "\n\t5.Modulo Division ");

		switch (sc.nextInt()) {
		case 1:

			ITest t1 = new ITest() {
				public int cal(int a, int b) {
					return a + b;
				}

			};
			int r1 = t1.cal(a, b);
			System.out.println("Additon :" + r1);
			break;
		case 2:
			ITest t2 = new ITest() {

				@Override
				public int cal(int a, int b) {
					return a - b;
				}

			};
			int r2 = t2.cal(a, b);
			System.out.println("Substration :" + r2);
			break;
		case 3:
			ITest t3 = new ITest() {

				@Override
				public int cal(int a, int b) {
					return a * b;
				}

			};
			int r3 = t3.cal(a, b);
			System.out.println("multiplication :" + r3);

			break;
		case 4:
			ITest t4 = new ITest() {

				@Override
				public int cal(int a, int b) {
					return a / b;
				}
			};
			int r4 = t4.cal(a, b);
			System.out.println("Division :" + r4);
			break;
		case 5:
			ITest t5 = new ITest() {

				@Override
				public int cal(int a, int b) {
					return a % b;
				}

			};
			int r5 = t5.cal(a, b);
			System.out.println("Modulo_Division :" + r5);
			break;
		default:
			System.out.println("Invalid choice... !");
		}

	}

}
