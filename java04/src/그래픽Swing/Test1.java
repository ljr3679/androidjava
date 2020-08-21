package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Test1 {

	public static void main(String[] args) {
		JFrame s = new JFrame();
		JButton s1 = new JButton();
		s1.setFont(new Font("궁서체", Font.BOLD, 60));
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(s, "신선해요");
			}
		});
		s1.setForeground(Color.BLUE);
		s1.setBackground(Color.YELLOW);
		JButton s2 = new JButton();
		s2.setFont(new Font("궁서체", Font.BOLD, 65));
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(s, "너무더워요");
			}
		});
		s2.setForeground(Color.GREEN);
		s2.setBackground(Color.PINK);
		s1.setText("봄");
		s2.setText("여름");
		s.getContentPane().add(s1);
		s.getContentPane().add(s2);
		
		s.setSize(200, 250);
		FlowLayout flow = new FlowLayout();
		s.getContentPane().setLayout(flow);
		
		s.setVisible(true);
		
		

	}

}
