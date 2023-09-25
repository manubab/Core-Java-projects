package maccess;
import java.util.*;
import test.*;
public class Demo_SpIiterater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		Student st[] = new Student[n];
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			System.out.println("Enter sid :");
			st[i].sid = sc.next();
			System.out.println("Enter sname :");
			st[i].sname = sc.next();
			System.out.println("Enter totalMarks :");
			st[i].totalMarks = sc.nextInt();
			st[i].per = st[i].totalMarks / 6;
		}
		Spliterator<Student> spl = Arrays.spliterator(st);
		spl.forEachRemaining((r) -> {
			System.out.println(r.toString());
		});
	}
}
