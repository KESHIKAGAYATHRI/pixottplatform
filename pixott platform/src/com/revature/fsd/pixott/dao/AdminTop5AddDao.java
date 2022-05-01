package com.revature.fsd.pixott.dao;
import java.util.List;

import com.revature.fsd.pixott.model.AdminTopModel;
import com.revature.fsd.pixott.handler.AdminHandler;

public class AdminTop5AddDao {
	public static void Displaymovies() {
		AdminTop5Dao dao = new AdminTop5Dao();
		List<AdminTopModel> res = dao.Top();
		System.out.println("Movies");
		System.out.println();
		res.forEach(System.out::println);
		System.out.println();
		//Adminremovedao.remove();
		AdminHandler.remove();
		
	}

}


