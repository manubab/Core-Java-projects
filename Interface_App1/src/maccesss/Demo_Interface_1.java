package maccesss;
import test.Additon;
import test.Division;
import test.ModuloDevision;
import test.Multilication;
import test.SubStraction;

import java.util.*;
public class Demo_Interface_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first value :-1");
		int v1=sc.nextInt();
		System.out.println("Enter second value-2");
		int v2=sc.nextInt();
		System.out.println("Enter second value-3");
		int v3=sc.nextInt();
		System.out.println("===Choice====");
		
		System.out.println("\t1.Add"+"\n\t2.Sub"+"\n\t3.Mul"
		                    +"\n\t4.Divi"+"\n\t5.ModuloDiv");
		System.out.println("Enter your choice...");
	   
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			Additon a=new Additon();
			a.calculate(v1,v2, v3);
			break;
		case 2:
			SubStraction sb=new SubStraction();
			sb.calculate(v1, v3, v2);
			break;
		case 3:
			Multilication m=new Multilication();
			m.calculate(v3, v1, v2);
			break;
		case 4:
			Division d=new Division();
			d.calculate(v1, v2, v3);
			break;
		case 5:
			ModuloDevision md=new ModuloDevision();
			md.calculate(v1, v2, v3);
			break;
			default :
				System.out.println("invalid choice....!");
			
		
		}
		
	}

}
