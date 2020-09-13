package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class BbsCrudUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.info);
		f.setSize(700, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("No");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("궁서", Font.BOLD, 20));
		l1.setBounds(33, 20, 93, 24);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Title");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("궁서", Font.BOLD, 20));
		l2.setBounds(167, 20, 93, 24);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Content");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("궁서", Font.BOLD, 20));
		l3.setBounds(33, 97, 93, 24);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("Writer");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("궁서", Font.BOLD, 20));
		l4.setBounds(33, 307, 93, 24);
		f.getContentPane().add(l4);
		
		JTextPane t1 = new JTextPane();
		t1.setBackground(SystemColor.controlHighlight);
		t1.setBounds(31, 54, 106, 33);
		f.getContentPane().add(t1);
		
		JTextPane t2 = new JTextPane();
		t2.setBackground(SystemColor.controlHighlight);
		t2.setBounds(167, 54, 114, 33);
		f.getContentPane().add(t2);
		
		JTextPane t3 = new JTextPane();
		t3.setBackground(SystemColor.controlHighlight);
		t3.setBounds(33, 131, 248, 166);
		f.getContentPane().add(t3);
		
		JTextPane t4 = new JTextPane();
		t4.setBackground(SystemColor.controlHighlight);
		t4.setBounds(33, 341, 248, 35);
		f.getContentPane().add(t4);
		
		JTextArea t5 = new JTextArea();
		t5.setBounds(313, 23, 331, 353);
		f.getContentPane().add(t5);
		
		JButton b1 = new JButton("글쓰기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String Writer = t4.getText();
				//db처리(BbsDAO), create()메서드 호출
				BbsDAO dao = new BbsDAO();
				BbsVO bag = new BbsVO();// 가방을만듦
				bag.setNo(Integer.parseInt(no));
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(Writer);
					try {
						dao.create(bag);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	
			}
		});
		b1.setBounds(25, 395, 114, 35);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("글검색");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
	            BbsDAO dao = new BbsDAO();
	          
	               BbsVO bag = null;
				try {
					bag = dao.one(Integer.parseInt(no));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	               t1.setText(String.valueOf(bag.getNo()));
	               t2.setText(bag.getTitle());
	               t3.setText(bag.getContent());
	               t4.setText(bag.getWriter());
	            }
			
		});
		b2.setBounds(151, 395, 114, 35);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("글수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				String coctent = t3.getText();
				BbsDAO dao = new BbsDAO();
				
				try {
					dao.update(no, coctent);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		b3.setBounds(278, 395, 114, 35);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("글삭제");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(no);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b4.setBounds(404, 395, 114, 35);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("전체목록");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> list = dao.all();
					System.out.println("게시판의 개수 : " + list.size() + "개");
					for (int i = 0; i < list.size(); i++) {// 4
						BbsVO bag = list.get(i);
						t5.append(bag.getNo() + " , " + bag.getTitle() + " , " 
								+ bag.getContent() + " , " + bag.getWriter()+ "\n");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		b5.setBounds(530, 395, 114, 35);
		f.getContentPane().add(b5);
		
		
		
		f.setVisible(true);

	}
}
