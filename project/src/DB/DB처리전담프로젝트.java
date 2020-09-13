package DB;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;






//특정한 방법을 처리하는 클래스 : 방법(model, DB처리)클래스
public class DB처리전담프로젝트 {
	private Object factory;


	//DB처리하는 바법이 4단계로 정해져 있다.
	public void create(String id, String pw, String name, String birth, String tel) throws Exception {
		System.out.println("DB에 저장 처리 함.");
		//1. connector 설정
		 Class.forName("com.mysql.jdbc.Driver");
		 //자바에서는 에러가 너무만히 발생할 것 가튼 상황에서는 반드시
		 //에러처리를 반드시 해주어야함.
		 //네트워크 연결, db연결, 파일연결, cpu연결
		 System.out.println("1. connector 설정 성공.!!");
		//2. db연결
		//  1)url: ip+port+db명
		//  2)username: root 
		//  3)password: 1234
		 String url = "jdbc:mysql://localhost:3366/food";
		 String user = "root";
		 String password = "1234";
		 Connection con = DriverManager.getConnection(url, user, password);
		 System.out.println("2. food연결 성공!!");
		 
		 //db 연동 index는 1부터 시작!
		 String sql = "insert into sign values(?,?,?,?,?)";
		 //컴퓨터는 이문장을 그냥 String으로 인식!!
		 PreparedStatement ps =con.prepareStatement(sql);
		 
		 ps.setString(1, id);
		 ps.setString(2, pw);
		 ps.setString(3, name);
		 ps.setString(4, birth);
		 ps.setString(5, tel);
		 
		 System.out.println("3. SQL문 생성 성공!!");
		 ps.executeUpdate();
		 System.out.println("4. SQL 네트위크 연결성송");
	
		//JOptionPane.showMessageDialog(null, "DB에 저장 처리 함.");
		System.out.println("DB에 저장 처리 함.");
		//1.
	}
	
	
	public int read(String id) throws Exception{//정보수정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/food";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "select * from sign where id = ?";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		//select의 결과는 검색결과가 담긴 테이블(항목+내용)
		//내용에는 없을수도 있고, 많을수고 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 정송 성공.!!");
		int result = 0;//없음
		if (rs.next() == true) {//결과가 있는지 없는지 체크 해주는 메서드
			//if (rs.next())와 동일함
			//if문은 rs.next()가 true일떄만 실행되므로!!
			System.out.println("검색결과가 있어요.");
			result = 1;//있음
			String id2 = rs.getString("id");
			System.out.println("검색결과 id : " + id2);
		}else {
			System.out.println("검색결과가 없어요111111111111.");
		}
		return result;
		//0이 넘어가면, 검색결과 없음.
		//1이 넘어가면, 검색결과 있음.

	}
	
	public boolean read(String id, String pw) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/food";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "select * from sign where id = ? and pw = ?";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		//select의 결과는 검색결과가 담긴 테이블(항목+내용)
		//내용에는 없을수도 있고, 많을수고 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 정송 성공.!!");
		boolean result1 = false;//로그인 not인 상태!
		if (rs.next() == true) {//결과가 있는지 없는지 체크 해주는 메서드
			//if (rs.next())와 동일함
			//if문은 rs.next()가 true일떄만 실행되므로!!
			System.out.println("로그인 ok.");
			result1 = true;//있음					
		}else {
			System.out.println("로그인 not.");
		}
		return result1;
		//false면 로그인not.
		//true면 로그인 ok.

	}
	
	
	
	public void update(String id, String pw, String name, String birth, String tel) throws SQLException, ClassNotFoundException {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함.");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/food";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "update sign set pw =?, name =?, birth =?, tel =? where id = ?";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, birth);
		ps.setString(4, tel);
		ps.setString(5, id);
		
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
		
	}

	public void Delete(String pw) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		
		String url = "jdbc:mysql://localhost:3366/food";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		
		String sql = "delete from sign where pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, pw);
		
		System.out.println("3. SQL문 생성 성공.!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
	}


	


	


	


	
	


	

	

}
