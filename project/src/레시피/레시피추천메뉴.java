package 레시피;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import DB.DB처리전담프로젝트;

import java.awt.event.ActionListener;
import java.awt.event.*;


public class 레시피추천메뉴 {
	
	static int count ;
	
	public void recom() {

	//public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 204));
		JLabel l0 = new JLabel("추천메뉴");
		l0.setBounds(12, 23, 662, 47);
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setFont(new Font("굴림", Font.BOLD, 40));
		l0.setForeground(Color.RED);
		JLabel l1 = new JLabel("조회수");
		l1.setBounds(52, 292, 150, 23);
		
		JButton b1 = new JButton();//닭도리탕
		b1.setBounds(52, 109, 150, 150);
		b1.setToolTipText("");
		
		JButton b2 = new JButton();
		b2.setBounds(263, 109, 150, 150);
		JButton b3 = new JButton();
		b3.setBounds(485, 109, 150, 150);
		JButton b4 = new JButton();
		b4.setBounds(52, 372, 150, 150);
		JButton b5 = new JButton();
		b5.setBounds(263, 372, 150, 150);
		JButton b6 = new JButton();
		b6.setBounds(485, 372, 150, 150);
		JButton bb1 = new JButton("닭볶음탕");
		bb1.setBounds(52, 262, 150, 23);
		bb1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				count++;
				l1.setText("조회수" + count);
				레시피닭볶음레시피 re1= new 레시피닭볶음레시피();
				re1.menu1();
				//f.dispose();	
			}	
		});
		JButton bb2 = new JButton("부대찌개");
		bb2.setBounds(263, 262, 150, 23);
		JButton bb3 = new JButton("떢볶이");
		bb3.setBounds(485, 262, 150, 23);
		JButton bb4 = new JButton("소불고기");
		bb4.setBounds(52, 532, 150, 23);
		JButton bb5 = new JButton("오징볶음");
		bb5.setBounds(263, 532, 150, 23);
		JButton bb6 = new JButton("소장조림");
		bb6.setBounds(485, 532, 150, 23);
		
		ImageIcon img1 = new ImageIcon("1.jpg");
		ImageIcon img2 = new ImageIcon("2.jpg");
		ImageIcon img3 = new ImageIcon("3.jpg");
		ImageIcon img4 = new ImageIcon("4.jpg");
		ImageIcon img5 = new ImageIcon("5.jpg");
		ImageIcon img6 = new ImageIcon("6.jpg");
		
		b1.setIcon(img1);
		b2.setIcon(img2);
		b3.setIcon(img3);
		b4.setIcon(img4);
		b5.setIcon(img5);
		b6.setIcon(img6);
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(l0);
		f.getContentPane().add(b1);
		f.getContentPane().add(bb1);
		f.getContentPane().add(b2);
		f.getContentPane().add(bb2);
		f.getContentPane().add(b3);
		f.getContentPane().add(bb3);
		f.getContentPane().add(b4);
		f.getContentPane().add(bb4);
		f.getContentPane().add(b5);
		f.getContentPane().add(bb5);
		f.getContentPane().add(b6);
		f.getContentPane().add(bb6);
		
		
		f.getContentPane().add(l1);
		
		
		f.setVisible(true);
	}
}
