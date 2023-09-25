package maccess;
import java.util.*;
import java.util.stream.Collectors;
class Student{
	private String id;
	private int rollNo;
	
	public Student(String id,int rollNo)
	{
		this.id=id;
		this.rollNo=rollNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + "]";
	}
}
public class ListToMap {
	public static void main(String[] args) {
		
		Student s1=new Student("manu",101);
		Student s2=new Student("Lalu",103);
		Student s3=new Student("manoj",104);
		
		List<Student> list= new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		
		
		Map<String, Integer> ob=list.stream().collect(Collectors.toMap(Student::getId,Student::getRollNo));
		
		System.out.println(ob);
	}

}
