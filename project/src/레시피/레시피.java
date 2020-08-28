package 레시피;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.DB처리전담프로젝트;

public class 레시피 {

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
		JButton b1 = new JButton("가입하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String id = t1.getText();
				String pw = t2.getText();
				String name = t4.getText();
				String birth = t5.getText();
				String tel = t6.getText();
				if(t2!=t3) {
					JOptionPane.showMessageDialog(f, "message");
				}else{
					JOptionPane.showMessageDialog(f, "가입을 축하드립니다.!!");
				}
				DB처리전담프로젝트 db = new DB처리전담프로젝트();
				
				try {
					db.create(id, pw, name, birth, tel);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		b1.setFont(new Font("굴림", Font.PLAIN, 25));
		b1.setBounds(218, 587, 234, 39);
		JButton b2 = new JButton("중복확인");
		b2.setFont(new Font("굴림", Font.BOLD, 14));
		b2.setBounds(521, 131, 103, 25);
		
		
		
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
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
	}

}
