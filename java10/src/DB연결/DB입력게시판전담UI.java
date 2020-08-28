package DB연결;

import javax.swing.JOptionPane;

public class DB입력게시판전담UI {

	public static void main(String[] args) throws Exception {
		String id = ("아이디 입력");
		String title = JOptionPane.showInputDialog("title 입력");
		String content = JOptionPane.showInputDialog("content 입력");
		String writer = JOptionPane.showInputDialog("writer 입력");
		DB처리전담게시판 db = new DB처리전담게시판();
		/*try {
			db.create(id, pw, name, tel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		db.create(id, title, content, writer);
	}

}
