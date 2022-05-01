package com.revature.fsd.pixott.handler;
import com.revature.fsd.pixott.dao.WishList;
import com.revature.fsd.pixott.dao.HistoryDao;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.customer.ExhibitTop5Movies;
public class CustomerMenuHandler {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1) View Top 5 Movies");
		System.out.println("2) Search Movies");
		System.out.println("3) Your Wish List");
		System.out.println("4) View History");
		System.out.println("5) Logout");
		int options = app.scanner.nextInt();
		if(options==1) {
			ExhibitTop5Movies.Displaymovies();
		}
		else if(options==2) {
			SurfingMovieHandler.searchmovie();
			
		}
		else if(options==3) {
			int a=LogInHandler.idofcustomer_name;
			WishList.wish(a);
			CustomerMenuHandler.menu();
		}
	
		else if(options==4) {
			int b=LogInHandler.idofcustomer_name;
			HistoryDao.ans(b);
			CustomerMenuHandler.menu();
			
		}
		else if(options==5) {
			System.out.println("Logged out Succesfully");
			System.out.println("======================");
			MainMenuHandler.dis();
			
		}
		else {
	            System.out.println("Invalid Selection");
	      		System.out.println("==================");
			     CustomerMenuHandler.menu();
		}
	}
}





