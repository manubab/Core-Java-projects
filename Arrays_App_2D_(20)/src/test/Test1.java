package test;

public class Test1 {
	public int[][] add(int[][] x ,int [][] y){
		int[][] c=new int[3][3];
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				 c[i][j]=x[i][j]+y[i][j];
			}
		}
		return c;
	}

}
