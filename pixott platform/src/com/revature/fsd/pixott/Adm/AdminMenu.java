package com.revature.fsd.pixott.Adm;

import com.revature.fsd.pixott.dao.AdminTop5AddDao;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.handler.AdminModifyHandler;
import com.revature.fsd.pixott.handler.LogInHandler;
import com.revature.fsd.pixott.handler.MainMenuHandler;

public class AdminMenu {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1)   Change Top 5 Movies");
		System.out.println("2)   Mark Movies Unavailable");
		System.out.println("3)   Modify Movie Details");
		System.out.println("4)   Logout");
		int ops = app.scanner.nextInt();
		if(ops==1) {
			System.out.println("Current Top 5 Movies");
			System.out.println("====================");
			AdminTop5AddDao.Displaymovies();	
		}
		else if(ops==3) {
			AdminModifyHandler.modify();
		}
		else if(ops==4) {
			System.out.println("You have been Logged out");
			System.out.println(LogInHandler.idofcustomer_name);
			MainMenuHandler.dis();
		}
		else {
			System.out.println("Wrong Selection please check the Number");
			AdminMenu.menu();
		}
	}
}	
	

