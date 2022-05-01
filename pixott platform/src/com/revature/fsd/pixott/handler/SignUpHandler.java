package com.revature.fsd.pixott.handler;
import com.revature.fsd.pixott.dao.SignUpDao;
import com.revature.fsd.pixott.app.app;

public class SignUpHandler {
	public static void displayresult() {
		app.scanner.nextLine();
		System.out.println("Name");
		String name = app.scanner.nextLine();
		System.out.println("Mobile");
		String number = app.scanner.nextLine();
		System.out.println("Password");
		String password = app.scanner.nextLine();
		System.out.println(SignUpDao.insertdetails(name,number,password));
		
		
		
	}

}


