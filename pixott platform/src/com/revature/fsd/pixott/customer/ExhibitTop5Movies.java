package com.revature.fsd.pixott.customer;

import java.util.List;

import com.revature.fsd.pixott.dao.HistoryListAddDao;
import com.revature.fsd.pixott.dao.WatchListDao;
import com.revature.fsd.pixott.dao.WatchListInsert;
import com.revature.fsd.pixott.model.Top5;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.handler.CustomerMenuHandler;
import com.revature.fsd.pixott.handler.LogInHandler;
public class ExhibitTop5Movies {
	public static void Displaymovies() {
		ViewTop5Movies dao = new ViewTop5Movies();
		List<Top5> res = dao.Top();
		System.out.println("Movies");
		System.out.println();
		res.forEach(System.out::println);
		System.out.println();
		menuhandler();
	}
	
		
		
		public static void menuhandler() {
			
		
		System.out.println("select A Movie enter Id");
		int id =app.scanner.nextInt();
		System.out.println("1)  Add to watchList");
		System.out.println("2)  Play Movie");
		int ans = app.scanner.nextInt();
		
		if(ans==1) {
			String moviename = WatchListDao.result(id);
			WatchListInsert.insert(moviename);
			int a=LogInHandler.idofcustomer_name;
			WatchListInsert.insertid(a,moviename);
			CustomerMenuHandler.menu();
			
			
			
		}
		else if (ans==2) {
			System.out.println("Enjoy the movie");
			System.out.println("Movie Ended");
			String adder=WatchListDao.result(id);
			HistoryListAddDao.insert(adder);
			int b = LogInHandler.idofcustomer_name;
			HistoryListAddDao.insertid(adder,b);
			CustomerMenuHandler.menu();
		}
		}
			
			
			
		}
		

