package test;

public class StudentResult {
	public String result(float marks) {
		if (marks > 70 && marks <= 100) {
			return "Distention";
		} else if (marks >= 60 && marks <= 70) {
			return "First Class";
		} else if (marks > 50 && marks < 60) {
			return "second Class";
		} else if (marks > 35 && marks <= 50) {
			return "Third class";
		} else {
			return "fail";
		}

	}

}
