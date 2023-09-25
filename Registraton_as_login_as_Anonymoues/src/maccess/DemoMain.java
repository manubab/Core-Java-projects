package maccess;
import test.*;
public class DemoMain {
	public static void main(String[] args) {
		Registration ob=new Registration()
				{

					public void registation() {
						for(int i=1;i<=5;i++)
						{
							
						System.out.println("Ur method Interface method...!");
						try {
						
						Thread.sleep(1200);
						Login o=new Login()
						{

							public void login() {
							for(int i=1;i<=5;i++)
							{
								System.out.println("Login user2"+new java.util.Date());
								try {
								Thread.sleep(2000);
								
								}
								catch(Exception e)
								{
									e.printStackTrace();
								}
								
							}
								
							}
					
						};
						o.login();
						
						}catch(Exception e)
						{
							e.printStackTrace();
						}
						
						}
						
					}
			
				};
				ob.registation();
				
		
	}

}
