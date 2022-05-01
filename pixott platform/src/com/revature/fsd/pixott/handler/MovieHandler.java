package com.revature.fsd.pixott.handler;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.app.app;

public class MovieHandler {
	public static void dis() {
		System.out.println("PIX OTT APP");
		System.out.println("=============");
		System.out.println("1==>>>>  Signup");
		System.out.println("2==>>>>  Login");
		System.out.println("3==>>>>  Exit");
		System.out.println("=============");
		int ops = app.scanner.nextInt();
		if (ops == 1) {
			SignUpHandler.displayresult();
			MainMenuHandler.dis();
		}
		else if(ops==2) {
			LogInHandler.users();
			
		}
		else {
			System.out.println("THANK YOU FOR  USING THE APP");
		}
	}

}


