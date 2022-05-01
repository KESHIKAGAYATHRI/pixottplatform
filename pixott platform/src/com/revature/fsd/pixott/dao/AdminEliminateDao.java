package com.revature.fsd.pixott.dao;
import java.util.List;

import com.revature.fsd.pixott.model.Top5;
import com.revature.fsd.pixott.Adm.AdminMenu;
import com.revature.fsd.pixott.app.app;
import com.revature.fsd.pixott.customer.ViewTop5Movies;

public class AdminEliminateDao {
	public static void remove() {
		ViewTop5Movies dao = new ViewTop5Movies();
		List<Top5> res = dao.Top();
		System.out.println("Movies");
		System.out.println();
		res.forEach(System.out::println);
		System.out.println();
		AdminMenu.menu();
	}	
	

}


