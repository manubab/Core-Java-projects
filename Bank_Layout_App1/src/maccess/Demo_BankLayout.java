package maccess;
import java.util.*;
import test1.*;
public class Demo_BankLayout {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		abc:
		while(true) {
			System.out.println("Enter pin number");
			int pinNo=sc.nextInt();
			if(pinNo>=1000&&pinNo<=9999) {
				CheckPinNo cpn=new CheckPinNo();
				boolean k=cpn.verify(pinNo);
				if(k) {
					System.out.println("====Choice====");
					System.out.println("t1.WithDraw.."+"\n\t2.Diposit"+"\n\t3.BalenceEnquary");
					System.out.println("Enter your choice....");
					int n=sc.nextInt();
					switch(n) {
					case 1:
						System.out.println("Enter amt");
						int amt=sc.nextInt();
						if(amt>0&&amt%100==0) {
							Withdraw w=new Withdraw();
							w.process(amt);
						}else {
							System.out.println("invalid amount...");
						}
						break abc;
					case 2:
						System.out.println("Enter amt");
						int damt=sc.nextInt();
						if(damt%100==0) {
							Diposit d=new Diposit();
							d.process(damt);
							System.out.println("Transection complete .......!");
						}
						break abc;
					case 3:
						Balence b=new Balence();
						b.getBalence();
						System.out.println("Avilable Balence :"+b.getBalence());
						break abc;
						default:
							System.out.println("invalid choice..!");
					}
				}else {
					System.out.println("inCurrect PinNo...!");
					break abc;
				}
			}else {
				System.out.println("invalid pin no....!");
				count++;
				break;
			}// 1st if if close
			if(count==3) {
				System.out.println("transaction blocked...!");
				break;
			}
		}// end of while
	}

}

