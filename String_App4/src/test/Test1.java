package test;

public class Test1 {
	public boolean validRollNo(String r) {
		return switch(r) {
		case "01": yield true;
		case "02": yield true;
		case "03": yield true;
		case "04": yield true;
		case "05": yield true;
		default :yield false;
		};
	}

}
