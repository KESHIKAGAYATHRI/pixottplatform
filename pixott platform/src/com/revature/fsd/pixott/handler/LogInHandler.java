package com.revature.fsd.pixott.handler;
import com.revature.fsd.pixott.Adm.AdminMenu;
import com.revature.fsd.pixott.Duplicate.FindId;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.dao.LogInDao;
import com.revature.fsd.pixott.dao.LogInDao;
import com.revature.fsd.pixott.app.app;

public class LogInHandler {
	public static int idofcustomer_name;

	public static void users() {
		app.scanner.nextLine();
		System.out.println("Number");
		String diff = app.scanner.nextLine();
		System.out.println("Password");
		String pass = app.scanner.nextLine();
		String adminpass = "pass";
		boolean result = LogInDao.resultcheck(diff,pass);
		String gem = LogInDao.nameuser(diff);
		if(diff.contains("99999") && pass.equals(adminpass)) {
			System.out.println("welcome Admin");
			System.out.println();
			AdminMenu.menu();
			
			
		}
		else if(result) {
			System.out.println("You have succesfully Logged in");
			System.out.println("welcome Back "+ gem);
			System.out.println();
			System.out.println();
			idofcustomer_name=FindId.id(diff);
			CustomerMenuHandler.menu();
			 
			
			
		}
		else {
			System.out.println("Invalid Username / Password");
			System.out.println();
			MainMenuHandler.dis();
		}
		
	}




}
