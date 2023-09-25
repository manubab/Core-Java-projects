package Oops;

 class Student {
	 private String name;
	 private int phymarks;
	 private int chemarks;
	 private int biomarks;
	 
	 public void setname(String name) {
		 
		this.name=name;
		 
	 }
	 public  void setphymarks(int phymarks) {
		 
			this.phymarks=phymarks;
			
	 }
	 public  void setchemarks(int chemarks) {
		 
			this.chemarks=chemarks;
	 }
	 public   void setbiomarks(int biomarks) {
		 
			this.biomarks=biomarks;
	 }
	 void marks() {
		 System.out.println("Student name"+ name);
		 System.out.println("marks of physics"+ phymarks);
		 System.out.println("marks of chemarks"+ chemarks);
		 System.out.println("marks of biomarks "+ biomarks);
		 
		 int totalmarks=phymarks+chemarks+biomarks;
		 
		 float percentage=(totalmarks*100)/300;
		 
		 System.out.println("Percentage of PCB"+ percentage);
		 
	 }
}
 
 public class StudentMarks{
	 public static void main(String[] args) {
		Student st=new Student();
		st.setname(  " manu");
		st.setphymarks(67);
		st.setchemarks(87);
		st.setbiomarks(96);
		
		st.marks();
	}
	 
 }
