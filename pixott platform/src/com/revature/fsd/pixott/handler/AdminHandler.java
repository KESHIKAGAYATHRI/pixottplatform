package com.revature.fsd.pixott.handler;
import com.revature.fsd.pixott.dao.AdminEliminateDao;
import com.revature.fsd.pixott.dao.MovieNames;
import com.revature.fsd.pixott.dao.SearchingMoviesDao;
import com.revature.fsd.pixott.dao.UpdateId;
import com.revature.fsd.pixott.dao.UpdateMovieDao;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.customer.ExhibitTop5Movies;

public class AdminHandler {
	public static void remove() {
		System.out.println("Select a Movie to Remove from Top5 (EnterId) :");
		int idofmovie=app.scanner.nextInt();
		System.out.println("Search a Movie with Keyword");
		app.scanner.nextLine();
		String original = app.scanner.nextLine();
		SearchingMoviesDao.search(original);
		System.out.println("Select a Movie to Add to top 5 (Enter Id)");
		int changemovie = app.scanner.nextInt();
		String name=MovieNames.method(changemovie);
		UpdateMovieDao.update(idofmovie,name);
		int total=UpdateId.updateid(name);
		UpdateId.insertid(total, name);
		System.out.println();
		System.out.println("Top 5 Movies After Changes");
		System.out.println("============================");
		AdminEliminateDao.remove();
		
		
		
		
	}

}


