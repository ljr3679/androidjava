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

public class 레시피회원탈퇴 {
	
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public void del() {
	
	
	//public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l0 = new JLabel();//회원가입
		l0.setFont(new Font("굴림", Font.BOLD, 40));
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setBounds(78, 10, 317, 59);
		l0.setBackground(Color.YELLOW);
		l0.setForeground(Color.BLACK);
		l0.setText("회원탈퇴");
		JLabel l1 = new JLabel("아이디");
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l1.setBounds(43, 79, 126, 53);
		JLabel l2 = new JLabel("비밀번호 ");
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l2.setBounds(43, 148, 126, 53);
		
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.WHITE);
		t1.setBounds(207, 79, 204, 53);
		JTextField t2 = new JTextField(10);
		t2.setBounds(207, 154, 204, 53);
		
		t3 = new JTextField();
		t3.setBounds(43, 273, 374, 115);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		
		
		JButton b1 = new JButton("안    녕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String id = t1.getText();
					String pw = t2.getText();
					t3.setText(id);
					레시피회원로그인 dl= new 레시피회원로그인();
					
					dl.log();
					JFrame frame = new JFrame();
			        frame.setVisible(true);
					t2.setText(id);
					//f.dispose();
					
					
					DB처리전담프로젝트 dao = new DB처리전담프로젝트();
					    
					
					
								try {
									dao.Delete(pw);
								} catch (Exception e1) {
									System.out.println("손ㅇㅁㄹㄴㅁㅇ");
									e1.printStackTrace();
								}
							
						
						
				}
				
				
			

			
		});
		
		
		b1.setFont(new Font("굴림", Font.PLAIN, 25));
		b1.setBounds(121, 398, 234, 39);
		
		
		
		
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(l0);
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		
		
		
		JLabel l3 = new JLabel("탈퇴사유");
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		l3.setBounds(43, 222, 126, 53);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("탈퇴사유를 300자이상 적어주요!!");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setForeground(Color.RED);
		l4.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 15));
		l4.setBounds(162, 242, 249, 24);
		f.getContentPane().add(l4);

		f.setVisible(true);
		
		
		
	}	
}
