package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {
	public void create(BbsVO vo) throws Exception{
		//DB프로그램 절차에 맞춰 코딩
		//1. connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "insert into bbs values (?, ?, ?, ?)";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
	}

	public BbsVO one(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩
//      1. connector설정
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("1. connector연결 성공.!!");

     // 2. db연결
//           String url = "연결하는방법://ip:port/db명";
     String url = "jdbc:mysql://localhost:3366/shop1";
     String user = "root";
     String password = "1234";
     Connection con = DriverManager.getConnection(url, user, password);
     System.out.println("2. db연결 성공.!!");

     // 3. sql문을 만든다.
     String sql = "select * from bbs where no = ?";
     //select * from member where id = 'park' //setString
     //select * from bbs where no = 1 //setInt
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1, no);

     // 4. sql문은 전송
     // select의 결과는 검색결과가 담긴 테이블(항목+내용)
     // 내용에는 없을 수도 있고, 많은 수도 있음.
     ResultSet rs = ps.executeQuery();
     System.out.println("4. SQL문 전송 성공.!!");
     BbsVO bag = new BbsVO();//가방만들어서,
     if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
        System.out.println("검색결과가 있어요.");
        int no2 = rs.getInt("no");
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        //가방에 넣기
        bag.setNo(no2);
        bag.setTitle(title);
        bag.setContent(content);
        bag.setWriter(writer);
        System.out.println("검색결과 ino2: " + no2);
        System.out.println("검색결과 title: " + title);
        System.out.println("검색결과 content: " + content);
        System.out.println("검색결과 writer: " + writer);
     } else {
        System.out.println("검색결과가 없어요.");
     }
     return bag;
     // bag은 참조형 변수, 주소를 전달!
  }
	
	
	public ArrayList<BbsVO> all() throws Exception {
		//가방을 넣는 컨테이너 역할을 하게됨.!
		//<>안에는 컨테이너에 무엇을 넣을지 지정.!
		
       //DB프로그램 절차에 맞추어서 코딩
       //1. connector설정
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("1. connector연결 성공.!!");

     // 2. db연결
     //String url = "연결하는방법://ip:port/db명";
     String url = "jdbc:mysql://localhost:3366/shop1";
     String user = "root";
     String password = "1234";
     Connection con = DriverManager.getConnection(url, user, password);
     System.out.println("2. db연결 성공.!!");

     // 3. sql문을 만든다.
     String sql = "select * from bbs";
     //select * from member where id = 'park' //setString
     //select * from bbs where no = 1 //setInt
     PreparedStatement ps = con.prepareStatement(sql);
     
     // 4. sql문은 전송
     // select의 결과는 검색결과가 담긴 테이블(항목+내용)
     // 내용에는 없을 수도 있고, 많은 수도 있음.
     ResultSet rs = ps.executeQuery();
     System.out.println("4. SQL문 전송 성공.!!");
     ArrayList<BbsVO> list = new ArrayList<BbsVO>();
     while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
    	BbsVO bag = new BbsVO();//가방만들어서,
        int no2 = rs.getInt("no");
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        //가방에 넣기
        bag.setNo(no2); //커서(위치 알려주는친구)
        bag.setTitle(title);
        bag.setContent(content);
        bag.setWriter(writer);
        //컨테이너에 넣는다.
        list.add(bag);
     } 
     return list;
     // bag은 참조형 변수, 주소를 전달!
  }
	
	
	/*public int read(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "select * from bbs where no = ?";//값이 없으면 null을 넣어주면됨
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
			String pw2 = rs.getString("pw");
			String name2 = rs.getString("name");
			String tel2 = rs.getString("tel");
			System.out.println("검색결과 id : " + id2);
			System.out.println("검색결과 pw : " + pw2);
			System.out.println("검색결과 name : " + name2);
			System.out.println("검색결과 tel : " + tel2);
		}else {
			System.out.println("검색결과가 없어요.");
		}
		return result;
		//0이 넘어가면, 검색결과 없음.
		//1이 넘어가면, 검색결과 있음.
	}*/
	public void update(int no, String content) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		//2. db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		//3. sql문을 만들다.
		String sql = "update bbs set content = ? where no = ?";//값이 없으면 null을 넣어주면됨
		PreparedStatement ps = con.prepareStatement(sql);
		BbsVO vo = new BbsVO();
		ps.setString(1, content);
		ps.setInt(2, no);
		
		
		System.out.println("3. SQL문 생성 성공.!!");
		//4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
	}
	
	public void delete(int no) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");
		
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.!!");
		
		String sql = "delete from bbs where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		BbsVO vo = new BbsVO();
		ps.setInt(1, no);
		System.out.println("3. SQL문 생성 성공.!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 정송 성공.!!");
	
	}
	
	

	
}

