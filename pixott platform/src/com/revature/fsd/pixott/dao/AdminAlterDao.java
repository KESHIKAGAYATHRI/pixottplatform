package com.revature.fsd.pixott.dao;
 import com.revature.fsd.pixott.app.app;

	public class AdminAlterDao {
		public static void modify() 
		{
			app.scanner.nextLine();
			System.out.println("Search a Movie with Keyword");
			String moviename = app.scanner.nextLine();
			SearchingMoviesDao.search(moviename);
			System.out.println("Select a Movie to Update Enter [ID]");
			int select = app.scanner.nextInt();
			System.out.println("what is the Updated name for Movie with Id"+select+"?");
			app.scanner.nextLine();
			String updated = app.scanner.nextLine();
			String name=MovieNames.method(select);
			UpdateId.update(updated, select);	
		}

	}


