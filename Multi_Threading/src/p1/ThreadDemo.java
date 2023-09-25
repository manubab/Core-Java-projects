package p1;

import test.Login;
import test.Login2;
import test.Register1;

public class ThreadDemo {
	public static void main(String[] args) {
		new Thread(Register1::reg).start();
		new Thread(Login2::log).start();
		
	}

}
