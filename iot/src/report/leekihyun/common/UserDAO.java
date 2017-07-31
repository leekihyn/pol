//맨처음에한거
package report.leekihyun.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDAO {
	public List<HashMap> doSelect(String sql) {
		List<HashMap> userlist = new ArrayList<HashMap>();
		try {
			Connection con = DBConn2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
		
			while (rs.next()) {
				userlist.add(null);
			}
			DBConn2.closeCon();
			return userlist;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		UserDAO ud = new UserDAO();
		String sql = "select num,id,pwd, name, age from user";
		List<HashMap> userList = ud.doSelect(sql);
		System.out.println("유저리스트->" + userList);
		sql = "select num,id,pwd, name, age from user_info";
		userList = ud.doSelect(sql);
		System.out.println("유저 인포리스트->" + userList);
	}
}
