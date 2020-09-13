package 레시피;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.net.ssl.SSLSession;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DB.DB처리전담프로젝트;


public class 레시피회원로그인 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void log() {
	
	//public static void main(String[] args) {
	
	 
		// TODO Auto-generated method stub
				JFrame f = new JFrame();
				JLabel l0 = new JLabel();//회원가입
				l0.setFont(new Font("굴림", Font.BOLD, 40));
				l0.setHorizontalAlignment(SwingConstants.CENTER);
				l0.setBounds(78, 22, 317, 59);
				l0.setBackground(Color.YELLOW);
				l0.setForeground(Color.BLACK);
				l0.setText("로그인");
				JLabel l1 = new JLabel("아이디 : ");
				l1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
				l1.setBounds(43, 115, 126, 53);
				JLabel l2 = new JLabel("비밀번호 : ");
				l2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
				l2.setBounds(43, 191, 126, 53);
				
				JTextField t1 = new JTextField(10);
				t1.setBackground(Color.WHITE);
				t1.setBounds(207, 115, 204, 53);
				JTextField t2 = new JTextField(10);
				t2.setBounds(207, 197, 204, 53);
				
				
				
				
				
				JButton b1 = new JButton("로그인");
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String id = t1.getText();
						String pw = t2.getText();
						
						DB처리전담프로젝트 dao = new DB처리전담프로젝트();
										
										
						boolean result1 = false;
						try {
							result1 = dao.read(id, pw);
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						if (result1 == true) {//검색결과 있음.
							JOptionPane.showMessageDialog(f, t1.getText()+"님 반가와요.");							
						}else {
							JOptionPane.showMessageDialog(f, "입력이 정보가 없습니다!! 다시 입력해주세요.");
						}					
						
					}

					
				});
				
				
				b1.setFont(new Font("굴림", Font.PLAIN, 25));
				b1.setBounds(119, 287, 234, 39);
				
				
				
				
				f.setSize(500,500);
				f.getContentPane().setLayout(null);
				f.getContentPane().add(l0);
				f.getContentPane().add(l1);
				f.getContentPane().add(t1);
				f.getContentPane().add(l2);
				f.getContentPane().add(t2);
				f.getContentPane().add(b1);
				
				JButton b2 = new JButton("회원가입");
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						레시피회원가입 lg= new 레시피회원가입();
						try {
							//lg.sign();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						f.dispose();
					}
				});
				b2.setFont(new Font("굴림", Font.PLAIN, 25));
				b2.setBounds(119, 374, 234, 39);
				f.getContentPane().add(b2);

				f.setVisible(true);
				
				
				
			}
		
}