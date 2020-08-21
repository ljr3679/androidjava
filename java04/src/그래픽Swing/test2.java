package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JTextField n1 = new JTextField(10);
		n1.setFont(new Font("굴림", Font.PLAIN, 55));
		n1.setBackground(Color.RED);
		JTextField n2 = new JTextField(10);
		n2.setBackground(Color.GREEN);
		n2.setFont(new Font("굴림", Font.PLAIN, 55));
		
		//JLabel result = new JLabel();
		//result.setForeground(Color.RED);
		//result.setFont(new Font("굴림", Font.PLAIN, 34));
		
		//JLabel result1 = new JLabel();
		//result1.setForeground(Color.RED);
		//result1.setFont(new Font("굴림", Font.PLAIN, 34));
		
		JLabel result2 = new JLabel();
		result2.setForeground(Color.RED);
		result2.setFont(new Font("굴림", Font.PLAIN, 34));
		
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = n1.getText();
				String s2 = n2.getText();
				//System.out.println("t1값:" + s1);
				//System.out.println("t2값:" + s2);

				// 산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				//String i3 = String.valueOf(i1);
				//result.setText("");
				//String i4 = String.valueOf(i2);
				//result1.setText("");
				// 큰지 작은지
				if(i1 > i2) {
					result2.setText("첫번째 숫자가 크다");
					
				}else if( i1 < i2) {
					result2.setText("두번째 숫자가 크다");
					
				}else {
					result2.setText("같다");
				}

				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setText("누가더 큰가요?");

		FlowLayout flow = new FlowLayout();
		f.setSize(500, 700);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(n1);
		f.getContentPane().add(n2);
		f.getContentPane().add(b1);
		//f.getContentPane().add(result);
		//f.getContentPane().add(result1);
		f.getContentPane().add(result2);
		

		f.setVisible(true);
	}

}
