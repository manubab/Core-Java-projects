package test;

public class Grade {
	public String grade(float perc){
		if(perc>=70&&perc<=100) {
			return "Destiction";
			
		}else if(perc>=60&&perc<70) {
			return "First class";
		}else if(perc>=50&&perc<60) {
			return "Second class";
		}else if(perc>=35&&perc<40) {
			return "Third class";		
		}else {
			return "fail";
		}
		
		
		
	}
		
		
		
		
		
		
	
}
