package report.leekihyun.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.leekihyun.common.DBConn2;

public class CommentDAO {

	Connection con;

	CommentDAO() throws ClassNotFoundException, SQLException {
		con = DBConn2.getCon();

	}

	public List<Map> getCommentList(int boardNum) throws SQLException {
		String sql = "select ci_num, content, reg_date, user_num,board_num from comment_info";
		sql += " where num=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNum);

		ResultSet rs = ps.executeQuery();
		ArrayList commentList = new ArrayList();
		while (rs.next()) {
			HashMap hm = new HashMap();
			hm.put("ci_num", rs.getString("ci_num"));
			hm.put("content", rs.getString("content"));
			hm.put("reg_Date", rs.getString("reg_Date"));
			hm.put("user_num", rs.getString("user_num"));
			commentList.add(hm);
		}
		rs.close();
		rs = null;
		ps.close();
		ps = null;
		return commentList;
	}

	public void closeCon() {
		try {
			DBConn2.closeCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			CommentDAO cdao = new CommentDAO();
			List<Map> commentList = cdao.getCommentList(Integer.parseInt("1"));
			for (Map m2 : commentList) {
				System.out.println(m2);
			}
			DBConn2.closeCon();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

// 따로따로 저장되거나 롤빽 되거나함.