package report.leekihyun.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDAO1 {
	public List<HashMap> doSelect(String sql) {
		List<HashMap> userlist = new ArrayList<HashMap>();
		try {
			Connection con = DBConn2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next()) {
				HashMap hm = new HashMap();
				int colCount = rsmd.getColumnCount();
				for (int i = 1; i <= colCount; i++) { // 포문 아래로넘어가는게 아니라 옆으로
														// 넘어가는거 num-id-pwd...
					String colName = rsmd.getColumnName(i); // DB는 1부터 시작
					hm.put(colName, rs.getString(colName)); // 해쉬맵에 num 킷값으로
															// 펄스나오면 포문끝나고 리턴함
				}
				userlist.add(hm);
			}
			DBConn2.closeCon();
			return userlist;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		UserDAO1 ud = new UserDAO1();
		String sql = "select ui.num, ui.name, ui.id,ui.pwd,ui.age,ci.class_name, ci.class_num from user_info as ui, class_info as ci where ui.class_num=ci.class_num;";
		List<HashMap> userList = ud.doSelect(sql);
		System.out.println("=유저리스트=");
		for (HashMap hm : userList) {
			System.out.println(hm);
		}
		sql = "inesert into user_info";
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("id", "green");
		hm.put("pwd", "green");
		hm.put("name", "녹길동");
		hm.put("age", "21");
		hm.put("class_num", "3");
		
		
		// sql = "select num,id,pwd, name, age from user_info";
		// userList = ud.doSelect(sql);
		// System.out.println("=유저 인포리스트=");
		// for (HashMap hm : userList) {
		// System.out.println(hm);
		// }
	}
}
