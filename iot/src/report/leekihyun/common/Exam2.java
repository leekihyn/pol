package report.leekihyun.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exam2 {

	public List<String> getUserIDLists(String name) {
		// String result = "";
		List<String> userlist = new ArrayList<String>();
		try {
			Connection con = DBConn2.getCon();
			String sql = "select ID,PWD,NAME,AGE from user";
			if (!name.equals("")) {
				sql += "WHERE NAME='" + name + "'";
			}
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			while (rs.next()) { // 순서대로 실행(Activate all rows)
				userlist.add(rs.getString(1) + "," + rs.getString(2) + ","
			+ rs.getString(3) + "," + rs.getInt(4)); // 1//// 넣어두됨.
																													

			}
			DBConn2.closeCon();
			return userlist;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean insertUser() {
		try {
			Connection con = DBConn2.getCon();
			Scanner scan = new Scanner(System.in);
			HashMap<String, String> valueHm = new HashMap<String, String>();
			System.out.println("id를 입력해주세요");
			valueHm.put("id", scan.nextLine());
			System.out.println("pwd를 입력해주세요");
			valueHm.put("pwd", scan.nextLine());
			System.out.println("name를 입력해주세요");
			valueHm.put("name", scan.nextLine());
			System.out.println("나이를 입력해주세요");
			valueHm.put("age", scan.nextLine());

			String sql = "insert into user(id, pwd, name, age)" + "values('" + valueHm.get("id") + ","
					+ valueHm.get("pwd") + "," + valueHm.get("name") + "'" + Integer.parseInt(valueHm.get("age")) + ")";

			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if (result == 1) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	// public boolean delete(int num) {
	// try {
	// Connection con = DBConn2.getCon();
	// String sql = "delete from user where num='5';";
	// PreparedStatement prestmt = con.prepareStatement(sql);
	// int result = prestmt.executeUpdate();
	// DBConn2.closeCon();
	// if (result > 0) { // 0보다 크면 삭제되는거임
	// return true;
	// }
	// } catch (SQLException | ClassNotFoundException e) {
	// e.printStackTrace();
	// }
	// return false;
	// }

	// public boolean update(int num) {
	// try {
	// Connection con = DBConn2.getCon();
	// String sql = "update user set pwd = 'bobo' where id = 'red';";
	// PreparedStatement prestmt = con.prepareStatement(sql);
	// int result = prestmt.executeUpdate();
	// DBConn2.closeCon();
	// if (result > 0) {
	// return true;
	// }
	// } catch (SQLException | ClassNotFoundException e) {
	// e.printStackTrace();
	// }
	// return false;
	//
	// }

	public static void main(String[] args) {
		Exam2 e = new Exam2();
//		 지금 주석처리 한것들은 위에햇던것들임. 써먹어야되는거
		 if(e.insertUser()){
		 System.out.println("오 잘들어갓어요 유저테이블에");
		 }

//		 boolean isDel = e.delete(1);
//		 if (isDel) {
//		 System.out.println("유저테이블에 잘 삭제가 됫어");
//		 }
//		 boolean isUpd = e.update(1);
//		 if (isUpd) {
//		 System.out.println("유저테이블 업데이트됫엉");
//		 }

		 List<String> userList = e.getUserIDLists("");

		 for (int i = 0; i < userList.size(); i++) {
		 System.out.println(userList.get(i));
		 }

	}
}