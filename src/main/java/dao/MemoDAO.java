package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.MemoVO;

public class MemoDAO {
Connection conn;

public MemoDAO() {
	
	try {		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "user1", "1111");
		
		System.out.println(conn);
		
		
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
	public List<MemoVO> searchlist(String search) {
		

		String sql="select * from memo where content like '%"+search+"%'";
		List<MemoVO> list=new ArrayList<MemoVO>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {				
				list.add(new MemoVO(rs.getString(1)));				
			}
			rs.close();
			conn.close();
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
