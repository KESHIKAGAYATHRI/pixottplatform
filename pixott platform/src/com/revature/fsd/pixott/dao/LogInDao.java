package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogInDao {
	
	public static boolean resultcheck(String num, String pass) {
		String sql = String.format("select * from customer_name where number= '%s' && password= '%s';",num,pass);
		boolean answer = false;
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				answer=true;
			}	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return answer;
		
		
	}
	public static  String nameuser(String num) {
		String sml = String.format("select name from customer_name where number ='%s';",num);
		String nameofuser="";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sml);
			) {
			ResultSet rm = stmt.executeQuery();
			while(rm.next()) {
				nameofuser=rm.getString("name");
			}	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return nameofuser;
	}
}
		
	
	

