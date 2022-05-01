package com.revature.fsd.pixott.handler;
import java.util.List;

import com.revature.fsd.pixott.dao.SearchingMoviesDao;
import com.revature.fsd.pixott.model.Top5Movies;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.customer.ExhibitTop5Movies;

public class SurfingMovieHandler {
	public static void searchmovie() {
		app.scanner.nextLine();
		System.out.println("find Movie");
		System.out.println("==========");
		String moviename= app.scanner.nextLine();
		SearchingMoviesDao.search(moviename);
		ExhibitTop5Movies.menuhandler();
		
	}
	

}

