package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(27, 77, 148, 82);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 50));
		lblPw.setBounds(27, 169, 148, 82);
		f.getContentPane().add(lblPw);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1_1.setBounds(27, 261, 158, 82);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TEL");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1_1_1.setBounds(27, 353, 148, 82);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setBounds(210, 99, 198, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.ORANGE);
		t2.setColumns(10);
		t2.setBounds(210, 186, 198, 48);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.ORANGE);
		t3.setColumns(10);
		t3.setBounds(210, 279, 198, 48);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.ORANGE);
		t4.setColumns(10);
		t4.setBounds(210, 368, 198, 48);
		f.getContentPane().add(t4);
		
		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//db처리(MemberDAO), create()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		create.setBounds(37, 445, 97, 23);
		f.getContentPane().add(create);
		
		JButton read = new JButton("중복체크");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
						int result = dao.read(id);//0이나 1이 리턴 되어왔음...
						if (result == 1) {//검색결과 있음.
							t1.setText("있어요");
							t2.setText("있어요");
							t3.setText("있어요");
							t4.setText("있어요");
							
						}else {//검색결과 없음.
							t1.setText("없음");
							t2.setText("없음");
							t3.setText("없음");
							t4.setText("없음");
							t1.setBackground(Color.blue);
							t2.setBackground(Color.blue);
							t3.setBackground(Color.blue);
							t4.setBackground(Color.blue);
							
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		read.setBounds(181, 445, 97, 23);
		f.getContentPane().add(read);
		
		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		update.setBounds(37, 512, 97, 23);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		delete.setBounds(181, 512, 97, 23);
		f.getContentPane().add(delete);
		JLabel l1 = new JLabel("로그인결과");
		l1.setBounds(181, 563, 204, 31);
		f.getContentPane().add(l1);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				MemberDAO dao = new MemberDAO();				
								
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
					l1.setText("로그인 ok.");
				}else {
					l1.setText("로그인 not.");
				}	
			}
		});
		login.setBounds(37, 567, 97, 23);
		f.getContentPane().add(login);
		
		JButton read_1 = new JButton("회원검색");
		read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();//입력받음
				MemberDAO dao = new MemberDAO();//부품 만듬
				try {
					MemberVO bag = dao.one(id);//가방 만듦
					t1.setText(bag.getId());//ui에 얹어줌.
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		read_1.setBounds(306, 445, 97, 23);
		f.getContentPane().add(read_1);
		
		
		
		
		
		f.setVisible(true);
		}
}
