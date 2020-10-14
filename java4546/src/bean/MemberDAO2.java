package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbcp.DBConnectionMgr;

//CRUD 중김으로 기능을 정의
//데이터와 관련된 작업(Data Access object: DAO)
public class MemberDAO2 {
	Connection con;
	DBConnectionMgr dbcp;
	public MemberDAO2() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
	}
	//회원가입2
	public boolean create(MemberVO2 vo) throws Exception {
		con = dbcp.getConnection();
		//3. sql문을 만들다.
		String sql = "insert into member2 values (?, ?, ?, ?, ?, ?)";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getFirst_name());
		ps.setString(3, vo.getLast_name());
		ps.setString(4, vo.getEmail());
		ps.setString(5, vo.getGender());
		ps.setString(6, vo.getIp_address());
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
		boolean result = false;
		if (row==1) {
			result = true;
		}
		
		dbcp.freeConnection(con,ps);
		return result;
	}
	

}
