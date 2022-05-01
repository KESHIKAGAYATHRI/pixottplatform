package com.revature.fsd.pixott.Duplicate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.fsd.pixott.dao.Util;

public class FindId {
	public static int id(String diff) {
		String sql ="select id from username where number =(?)";
		int num = 0;
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setString(1,diff);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  num=rs.getInt("id"); 
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return num;
		
		
	}

}


