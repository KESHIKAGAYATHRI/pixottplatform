package com.revature.fsd.pixott.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.AdminTopModel;

public class AdminTop5Dao {
	public  List<AdminTopModel> Top() {
		String sql = "select * from top5 t left join movie m on t.name=m.name;";
		List<AdminTopModel> res = new ArrayList();
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					AdminTopModel review = new AdminTopModel();
					review.setName(rs.getString("name"));
					review.setId(rs.getInt("id"));
					res.add(review);
				}
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			return res;

}
}
	


