package test;

import java.util.*;
import test.Employee;

public class Demo_Employee_CF1_practice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee em = null;
		Set ob = null;
		String name;
		Scanner sc = new Scanner(System.in);
		try (sc;) {
			try {
				while (true) {
					System.out.println("--------------choice----------");
					System.out.println("\t1.HashSet\n\t2. LinkedList\n\t3.TreeSet\n\t4.exit");

					System.out.println("Enter choice :");

					switch (sc.nextInt()) {
					case 1:
						ob = new HashSet<Employee>();
						name = "HashSet";

						break;

					case 2:
						ob = new LinkedHashSet<Employee>();
						name = "LinkedHashSet";
						break;
					case 3:
						ob = new TreeSet<>();
						name = "TeeSet";
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("invalid choice ...!");
						continue;
					}
					x: while (true) {
						System.out.println(" performing operation...");
						System.out.println("---Choice----");
						System.out.println("\t1.add(E)\n\t2.remove(E)\n\t3.exit");
						System.out.println("Enter choice");

						switch (sc.nextInt()) {
						case 1:
							sc.nextLine();
							System.out.println("Enter name :");

							String Ename = sc.nextLine();
							System.out.println("Enter Employee email.com :");
							String mailid = sc.nextLine();
							System.out.println("Enter Emoployee Desg :");
							String desg = sc.nextLine();
							System.out.println("Enter Employee sal:");
							float bsal = Float.parseFloat(sc.nextLine());

							em = new Employee(Ename, mailid, desg, bsal);
							System.out.println("Successfully added Emoployee details");

							System.out.println(em.toString());

							break;
						case 2:
							if (ob.isEmpty()) {
								System.out.println("Details not there...!");
							} else {
								System.out.println("Enter Employee Name :");
								String ro = sc.nextLine();
								Iterator<Employee> it = ob.iterator();
								while (it.hasNext()) {
									Employee em1 = (Employee) it.next();

									if (em1.equals(ro)) {
										if (ob.remove(ro)) {
											System.out.println("object is remove...!");
											break;
										}
									}
								}
								System.out.println(ob.toString());

							}
							break;
						case 3:

							System.out.println("operation exit:" + name);
							break x;
						default:
							System.out.println("invalid choice...!");
							continue;

						}

					}

				} // loop closed

			} // inner try closed...
			catch (Exception e) {
				e.printStackTrace();
			} // catch closed...
		} // try closed..

	}

}
