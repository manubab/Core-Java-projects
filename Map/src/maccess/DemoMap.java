package maccess;
import java.util.*;
import test.EmpValues;
@SuppressWarnings("serial")
public class DemoMap extends Exception {
	public DemoMap(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, EmpValues> ob = null;
		String nm = null;
		try (sc;) {
			try {
				while (true) {
					System.out.println("***** Choice ****");
					System.out.println(
							"\t1.HashMap" + "\n\t2.LinkedHashMap" + "\n\t3.TreeMap" + "\n\t4.Hashtable" + "\n\t5.exit");
					System.out.println("Enter choice :");
					switch (Integer.parseInt(sc.nextLine())) {
					case 1:
						ob = new HashMap<String, EmpValues>();
						nm = "HashMap";
						break;
					case 2:
						ob = new LinkedHashMap<String, EmpValues>();
						nm = "LinkedHashMap";
						break;
					case 3:
						ob = new TreeMap<String, EmpValues>();
						nm = "TreeMap";
						break;
					case 4:
						ob = new Hashtable<String, EmpValues>();
						nm = "Hashtable";
						break;
					case 5:
						System.out.println("Operations Stopped On Map...!");
						System.exit(0);
						break;
					default:
						System.out.println("invalid Choice....!");
						continue;
					}
					System.out.println("Operations on Map " + nm);
					x: while (true) {
						System.out.println("-----Choice-----");
						System.out.println("\t1.put(k,v)" + "\n\t2.remove(Object)" + "\n\t3.get(Object)"
								+ "\n\t4.keySet()" + "\n\t5.values()" + "\n\t6.display()" + "\n\t7.exit");
						System.out.println("Enter choice  :");
						switch (Integer.parseInt(sc.nextLine())) {
						case 1:
							while (true) {
								try {
									EmpValues e = new EmpValues();
									System.out.println("Enter Emp Details :");
									System.out.println("Enter Eid:");
									String eid = sc.nextLine();
									System.out.println("Enter eName:");
									e.eName = sc.nextLine();
									System.out.println("Enter eDesg:");
									e.eDesg = sc.nextLine();
									System.out.println("Enter bSal:");
									e.bsal = Integer.parseInt(sc.nextLine());
									if (e.bsal < 1200) {
										throw new DemoMap("Invalid Amount");

									} else {
										e.totalSal = e.bsal + (0.93f * e.bsal) + (0.63f * e.bsal);

									}
									ob.put(eid, e);
									System.out.println("Data Succesfully addedd to " + nm);
									ob.forEach((p, q) -> {
										System.out.println(p + "\t" + q);
									});

								} catch (DemoMap me) {
									System.out.println(me.getMessage());
								}
								break;
							}
							break;
						case 2:
							if (ob.isEmpty()) {
								System.out.println("Map is Empty.....!");
							} else {
								System.out.println("Emp id");
								String ei = sc.nextLine();
								if (ob.containsKey(ei)) {

									ob.remove(ei);
									System.out.println(ei + " object removed Succesfully....!");
									ob.forEach((p, q) -> System.out.println(p + "\t" + q));
								} else {
									System.out.println("invalid id");
								}
							}
							break;
						case 3:
							if (ob.isEmpty()) {
								System.out.println("Map is Empty....!");
							} else {
								System.out.println("Enter id");
								String ei = sc.nextLine();
								if (ob.containsKey(ei)) {
									System.out.println(ob.get(ei));
								} else {
									System.out.println("invalid id....!");
								}
							}
							break;
						case 4:
							if (ob.isEmpty()) {
								System.out.println("Map is Empty...!");
							} else {
								System.out.println(ob.keySet());
							}
							break;
						case 5:
							if (ob.isEmpty()) {
								System.out.println("Map is Empty.....!");
							} else {
								System.out.println(ob.values());
							}
							break;
						case 6:
							if (ob.isEmpty()) {
								System.out.println("Map is Empty....!");
							} else {

								for (Map.Entry<String, EmpValues> entry : ob.entrySet()) {
									System.out.println(entry.getKey() + "\t" + entry.getValue());
								}
							}
							break;
						case 7:
							System.out.println("Operation Stopped on " + nm);
							break x;
						default:
							System.out.println("invalid Choice....!");
						}
					} // inner loop close
				} // end of loop
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
