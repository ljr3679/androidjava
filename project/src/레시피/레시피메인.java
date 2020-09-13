package 레시피;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 레시피메인 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		
		
		f.setSize(500,500);
		
		JButton b1 = new JButton("회원가입");
		b1.setBounds(35, 10, 419, 43);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				레시피회원가입 si= new 레시피회원가입();
				//si.sign();
             
				
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("로그인");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				레시피회원로그인 lg = new 레시피회원로그인();
				
				//lg.log();
			}
		});
		b2.setBounds(35, 72, 419, 43);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("회원정보수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				레시피회원정보수정 ch = new 레시피회원정보수정();
				
				//ch.chan();
			}
		});
		b3.setBounds(35, 136, 419, 43);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("회원탈퇴");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				레시피회원탈퇴 dl = new 레시피회원탈퇴();
				
				//dl.del();
				
			}
		});
		b4.setBounds(35, 197, 419, 43);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("레시피");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				레시피추천메뉴 dl = new 레시피추천메뉴();
				
				//dl.recom();
			}
		});
		b5.setBounds(35, 261, 419, 43);
		f.getContentPane().add(b5);
		f.setVisible(true);
		

	}
}
