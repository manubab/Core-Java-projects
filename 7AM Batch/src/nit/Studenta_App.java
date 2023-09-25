package nit;
import java.util.Scanner;

import test.Grade;
import test.Percentage;
import test.Total_Marks;
public class Studenta_App {
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter first subject value_1");
		
		int s1=s.nextInt();
		
		System.out.println("Enter first subject value_2");
		int s2=s.nextInt(); 
		System.out.println("Enter first subject value_3");
		int s3=s.nextInt();
		System.out.println("Enter first subject value_4");
		int s4=s.nextInt();
		System.out.println("Enter first subject value_5");
		int s5=s.nextInt();
		System.out.println("Enter first subject value_6");
		int s6=s.nextInt();	
		
		if((s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&(s3>=0&&s3<=100)&&(s4>=0&&s4<=100)&&(s5>=0&&s5<=100)) {
				
			Total_Marks tm=new Total_Marks();
			int total=tm.total(s1, s2, s3, s4, s5, s6);
			Percentage per=new Percentage();
	      	float perc=	per.per(total);
	      	Grade gr=new Grade();
	      String result=	gr.grade(perc);
	    
	      	
	      	System.out.println("=======output=====");
	      	System.out.println("Total-Marks"+total);
	      	System.out.println("Percentage :"+perc);
	      	System.out.println("result :"+result);
	      	
		}else {
			System.out.println("invalid marks");
			
		}
		
		}
	}


