package report.leekihyun.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import report.leekihyun.common.DBConn2;

public class TestDAO {

	public boolean inserTest() { // 4가지 목적을 가진 함수를 만들어본다
		try {
			String writer = "4";
			Connection con = DBConn2.getCon();
			String sql = "select * from user_info where num=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  writer);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				sql = " insert into test(title, content, writer, reg_date)";
			sql += " values(?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "게시물4");
			ps.setString(2, "내용4");
			ps.setString(3, "writer");
			Date d = new Date();
			SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
			ps.setString(4, sdt.format(d));
			int result = ps.executeUpdate();
			if (result == 1) {
				return true;
			}
			}else{
				System.out.println(writer + "번호를 가진 사람이 유저인포테이블에 없엉");
			}
			DBConn2.closeCon();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

	public List<Map> selecTest() {
		List<Map> testList = new ArrayList<Map>();
		try {
			Connection con = DBConn2.getCon();

			String sql = "SELECT T.*, UI.ID, UI.NAME FROM TEST AS T, USER_INFO AS UI";
			sql += " WHERE T.WRITER = UI.NUM;";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map hm = new HashMap();
				hm.put("num", rs.getString("num"));
				hm.put("title", rs.getString("title"));
				hm.put("content", rs.getString("content"));
				hm.put("writer", rs.getString("writer"));
				hm.put("reg_date", rs.getString("reg_date"));
				hm.put("id", rs.getString("id"));
				hm.put("name", rs.getString("name"));
				testList.add(hm);
			}
			DBConn2.closeCon();
			return testList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateTest(int num) {
		try {
			Connection con = DBConn2.getCon();
			String sql = "update test set num = '3' where id = 'blue';";
			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if (result > 0) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleTest(int num) {
		try {
			Connection con = DBConn2.getCon();
			String sql = "delete from test where num='2';";
			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if (result > 0) {
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		TestDAO tdao = new TestDAO();
		
		if (tdao.inserTest()) {							//라인 추가할때 쓰임 다른거 쓸때 주석처리 안해놓으면 	
			System.out.println("오~ 테스트테이블에 입력 잘되었어");//계속 위에 내용으로 추가됨
		}
//		boolean isDel = tdao.deleTest(1);				//삭제 시키는 명령
//		if (isDel) {
//			System.out.println("유저테이블에 잘 삭제가 됫어");
//		}
//		boolean isUpd = tdao.updateTest(1);					//수정하는 명령
//		if (isUpd) {
//			System.out.println("유저테이블 업데이트됫엉");
//		}
//		List<Map> list = tdao.selecTest();
//		for (Map m : list) {
//			System.out.println(m);
//		}
	}
}
