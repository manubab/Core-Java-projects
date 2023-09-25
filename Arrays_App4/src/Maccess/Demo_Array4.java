package Maccess;
import java.util.*;
import test.Student;
public class Demo_Array4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Students :");
		int n=sc.nextInt();
		System.out.println("Enter "+ n +" Number of student details :");
		Student[] stu=new Student[n];
		for(int i=0;i<stu.length;i++) {
			System.out.println("\n Enter "+(i+1)+" Student Details :");
			stu[i]=new Student();
			System.out.print("\n Enter Sid : ");
			stu[i].sid=sc.next();
			System.out.println("\n Enter Sname : ");
			stu[i].name=sc.next();
			System.out.print("Enter Marks :");
			stu[i].Marks=sc.nextInt();
			stu[i].total=stu[i].Marks*7;
			stu[i].per=stu[i].total/6;
			}
		for(Student s1: stu) {
			
			
			System.out.println(s1.toString());
		}
	}
}
