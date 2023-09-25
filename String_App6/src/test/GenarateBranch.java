package test;
public class GenarateBranch {
	public String genarate(String brcode) {
		return switch(brcode) {
		case "01" :yield "CIVIL";
		case "02" :yield "EE";
		case "03" :yield "MECH";
		case "04" :yield "EEE";
		case "05" :yield "CSE";
		default :yield null;
	};
	}

}
