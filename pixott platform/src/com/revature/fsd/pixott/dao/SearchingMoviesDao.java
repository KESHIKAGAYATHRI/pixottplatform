package com.revature.fsd.pixott.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Top5Movies;

public class SearchingMoviesDao {
	public static void search(String moviename){
		String sql = "select * from movie where name like (?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setString(1,"%" + moviename + "%");
			 ResultSet rs= stmt.executeQuery();
			 while(rs.next()) {
				 System.out.print(rs.getInt("id")+" ");
				 System.out.println(rs.getString("name")); 
			 }
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
	}

}


