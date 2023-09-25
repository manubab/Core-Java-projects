package maccess;

import java.util.*;

public class demo_ArrayList {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ArrayList Size");
		int n = sc.nextInt();
		ArrayList<Integer> ob = new ArrayList<>();
		System.out.println("Enter "+n+" Elements");
		for (int i = 1; i <= n; i++) {
			ob.add(new Integer(sc.nextInt()));
		}
		ListIterator<Integer> lt = ob.listIterator();
		System.out.print("Forward :");
		while (lt.hasNext()) {
			
			System.out.print(  lt.next() + " ");
		}
		System.out.print("\nBackWord :");
		while(lt.hasPrevious()) {
			System.out.print(lt.previous()+" ");
		}

	}

}
