package DB;

import javax.swing.JOptionPane;

public class DB입력프로젝트전담UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비번 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String birth = JOptionPane.showInputDialog("생년월일 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		DB처리전담프로젝트 db = new DB처리전담프로젝트();
		/*try {
			db.create(id, pw, name, tel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		db.create(id, pw, name, birth, tel);
	}

}
