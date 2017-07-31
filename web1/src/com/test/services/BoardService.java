package com.test.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.test.common.DBConn2;

public class BoardService {
	Connection con;

	public boolean insertUser(HashMap<String, String> hm) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConn2.getCon();
			String sql = "insert into board_info(bititle, bicontent, bipwd, creusr, credat)";
			sql += " values(?,?,?,?,?)";

			ps = con.prepareStatement(sql);
			ps.setString(1, hm.get("bititle"));
			ps.setString(2, hm.get("bicontent"));
			ps.setString(3, hm.get("bipwd"));
			ps.setString(4, hm.get("creusr"));
			ps.setString(5, hm.get("credat"));

			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean updateBoard(HashMap<String, String> hm) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConn2.getCon();
			String sql = "update board set title =?, content=?";
			sql += " where num = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, hm.get("title"));
			ps.setString(2, hm.get("content"));
			ps.setString(3, hm.get("num"));

			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteBoard(HashMap<String, String> hm) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConn2.getCon();
			String sql = "delete from board";
			sql += " where num = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, hm.get("num"));

			int result = ps.executeUpdate();
			if (result == 1) {
				con.commit();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				DBConn2.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

public boolean selectBoard(HashMap<String, String> hm) {
	Connection con = null;
	PreparedStatement ps = null;
	try {
		con = DBConn2.getCon();
		String sql = "select bititle, bicontent, bipwd, creusr, credat";
		sql += " where binum = ?";

		ps = con.prepareStatement(sql);
		ps.setString(1, hm.get("binum"));

		int result = ps.executeUpdate();
		if (result == 1) {
			con.commit();
			return true;
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			ps.close();
			DBConn2.closeCon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return false;
}
}
// public boolean insertUser(HashMap<String, String> hm) {
// Connection con = null;
// PreparedStatement ps = null;
//
// try {
// con = DBConn2.getCon();
// String sql = "insert into user_info(id, pwd, name, class_num, age)";
// sql += " values(?,?,?,?,?)";
//
// ps = con.prepareStatement(sql);
// ps.setString(1, hm.get("id"));
// ps.setString(2, hm.get("pwd"));
// ps.setString(3, hm.get("name"));
// ps.setString(4, hm.get("class_num"));
// ps.setString(5, hm.get("age"));
// int result = ps.executeUpdate();
// if (result == 1) {
// return true;
// }
// } catch (ClassNotFoundException e) {
// e.printStackTrace();
// } catch (SQLException e) {
// e.printStackTrace();
// } finally {
// try {
// ps.close();
// DBConn2.closeCon();
// } catch (SQLException e) {
// e.printStackTrace();
// }
// }
// return true;
// }
// }
