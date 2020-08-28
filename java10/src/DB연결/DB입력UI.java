package DB연결;

import javax.swing.JOptionPane;

public class DB입력UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전번 입력");
		DB처리전담 db = new DB처리전담();
		/*try {
			db.create(id, pw, name, tel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		db.create(id, pw, name, tel);
	}

}
