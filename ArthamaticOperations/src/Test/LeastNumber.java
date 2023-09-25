package Test;

public class LeastNumber {
	public int getLeastNum(int a,int b) {
		if(a<0||b<0) {
			return -1;
		}else if(a==0||b==0) {
			return -2;
		}else {
			if(a<b) {
				return a;
			}else {
				return b;
			}
		}
		
	}

}
