package test;

public class Branches {
	public String verifyBranch(String branch) {
		return switch(branch) {
		case "CI" : yield "01";
		case "EE" : yield "02";
		case "ME" : yield "03";
		case "EC" : yield "04";
		case "CS" : yield "05";
		default : yield null;
		};
	}

}
