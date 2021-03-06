package 레시피;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.DB처리전담프로젝트;
import DB.DB처리전담프로젝트VO;


import java.awt.SystemColor;

public class 레시피회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	protected Object sig;

	/**
	 * @wbp.parser.entryPoint
	 */
	//public void sign() {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JLabel l0 = new JLabel();//회원가입
		l0.setFont(new Font("굴림", Font.BOLD, 40));
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setBounds(171, 10, 317, 59);
		l0.setBackground(Color.YELLOW);
		l0.setForeground(Color.BLACK);
		l0.setText("회원가입");
		JLabel l1 = new JLabel("아이디 : ");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l1.setBounds(65, 121, 126, 53);
		JLabel l2 = new JLabel("비밀번호 : ");
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l2.setBounds(65, 197, 126, 53);
		JLabel l3 = new JLabel("비밀번호 확인 : ");
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l3.setBounds(65, 271, 204, 53);
		JLabel l4 = new JLabel("이름 : ");//이름
		l4.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l4.setBounds(65, 345, 126, 53);
		JLabel l5 = new JLabel("생년월일 : ");//생년월일
		l5.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l5.setBounds(65, 420, 126, 53);
		JLabel l6 = new JLabel("전화번호 : ");//전화번호
		l6.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l6.setBounds(65, 495, 126, 53);
		JLabel l7 = new JLabel("중복확인결과");
		l7.setForeground(SystemColor.control);
		l7.setFont(new Font("HY엽서M", Font.BOLD, 13));
		l7.setBounds(290, 172, 204, 25);
		JLabel l8 = new JLabel("비밀번호확인");
		l8.setForeground(SystemColor.control);
		l8.setFont(new Font("HY엽서M", Font.BOLD, 13));
		l8.setBounds(290, 323, 365, 25);
		
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.WHITE);
		t1.setBounds(290, 121, 204, 53);
		JTextField t2 = new JTextField(10);
		t2.setBounds(290, 197, 204, 53);
		JTextField t3 = new JTextField(10);
		t3.setBounds(290, 271, 204, 53);
		JTextField t4 = new JTextField(10);
		t4.setBounds(290, 345, 204, 53);
		JTextField t5 = new JTextField(10);
		t5.setBounds(290, 420, 204, 53);
		JTextField t6 = new JTextField(10);
		t6.setBounds(290, 495, 204, 53);
		
		JButton b3 = new JButton("비밀번호확인");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw = t2.getText();
				String pw1 = t3.getText();
				if (pw.equals(pw1)) {
					l8.setText("비밀번호가 일치합니다.");
					l8.setForeground(Color.blue);
				}else {
					l8.setText("비밀번호가 일치하지 않습니다!!");
					l8.setForeground(Color.red);
				}
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 12));
		b3.setBounds(521, 286, 134, 32);
		
		JButton b2 = new JButton("아이디중복확인");
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
			
				
				DB처리전담프로젝트 dao = new DB처리전담프로젝트();
						int result = 0;
						try {
							result = dao.read(id);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}//0이나 1이 리턴 되어왔음...
						if (result == 1) {//검색결과 있음.
							l7.setText("불가!! 다른아이디 사용바랍니다");
							l7.setForeground(Color.red);
						}else {//검색결과 없음.
							l7.setText("사용가능한 아이디 입니다.");
							l7.setForeground(Color.blue);
						}
				}	
			});
		b2.setFont(new Font("굴림", Font.BOLD, 12));
		b2.setBounds(521, 136, 134, 32);
		
		
		JButton b1 = new JButton("가입하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t4.getText();
				String birth = t5.getText();
				String tel = t6.getText();
				DB처리전담프로젝트 dao = new DB처리전담프로젝트();
				 
				try {
					
					if (t1.getText().length()!=0 && t2.getText().length()!=0 && t3.getText().length()!=0 
							&& t4.getText().length()!=0 && t5.getText().length()!=0 && t6.getText().length()!=0) {
						JOptionPane.showMessageDialog(f, t4.getText() + "님 가입을 축하드립니다.!!");
						dao.create(id, pw, name, birth, tel);
						레시피회원로그인 login= new 레시피회원로그인();
						//login.login();
						f.dispose();
					}else {
						JOptionPane.showMessageDialog(f, "항목이 누락 되었습니다.!!");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
		});
		
		
		b1.setFont(new Font("굴림", Font.PLAIN, 25));
		b1.setBounds(218, 587, 234, 39);
		
		
		
		
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(l0);
		f.getContentPane().add(l1);
		f.getContentPane().add(b2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(l3);
		f.getContentPane().add(t3);
		f.getContentPane().add(l4);
		f.getContentPane().add(t4);
		f.getContentPane().add(l5);
		f.getContentPane().add(t5);
		f.getContentPane().add(l6);
		f.getContentPane().add(t6);
		f.getContentPane().add(b1);
		f.getContentPane().add(l7);
		f.getContentPane().add(l8);
		
		
		
		f.getContentPane().add(b3);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
	}

	

	 

	

	
}
