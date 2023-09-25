package test;
public class Test {
	
	public Integer[][] add(Integer[][] x,Integer[][] y){
		
		Integer[][] z=new Integer[3][3];
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
		
	}

}
