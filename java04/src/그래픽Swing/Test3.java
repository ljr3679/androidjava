package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Test3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 60));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 40));
		JTextField t1 = new JTextField(30);
		JTextField t2 = new JTextField(30);
		JLabel result = new JLabel();
		result.setForeground(Color.BLUE);
		result.setFont(new Font("궁서체", Font.BOLD, 40));
		// JLabel result1 = new JLabel();
		JLabel result2 = new JLabel();
		result2.setForeground(Color.RED);
		result2.setFont(new Font("궁서체", Font.BOLD, 40));

		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				// String s3 = String.valueOf(s1);//다른 타입을 String으로
				result.setText(s1 + "");

				String s2 = t2.getText();
				// String s4 = String.valueOf(s2);//다른 타입을 String으로
				// result1.setText("");
				int i1 = Integer.parseInt(s2);
				
				if (i1 < 2001) {
					result2.setText("성인입니다");
				} else if (i1 > 2001) {

					result2.setText("성인아닙니다");
				}
			}
		});

		b1.setText("성인확인");
		b1.setFont(new Font("굴림", Font.PLAIN, 36));

		FlowLayout flow = new FlowLayout();
		f.setSize(500, 700);
		f.getContentPane().setLayout(flow);
		l1.setText("이름을 입력하세요");
		l2.setText("출생년도를 입력하세요");
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(result);
		// f.getContentPane().add(result1);
		f.getContentPane().add(result2);

		f.setVisible(true);

	}

}
