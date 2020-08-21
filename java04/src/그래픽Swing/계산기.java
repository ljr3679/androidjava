package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 계산기 {

	public static void main(String[] args) {
		// 프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		// 이미지1
		ImageIcon img = new ImageIcon("cal.png");
		// 라벨3
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 50));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 50));
		JLabel result = new JLabel();
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.PLAIN, 41));
		// 텍스트 입력2
		JTextField t1 = new JTextField(10);
		t1.setFont(new Font("굴림", Font.PLAIN, 50));
		t1.setBackground(Color.ORANGE);
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		t2.setBackground(Color.ORANGE);
		// 버튼1
		JButton plus = new JButton();
		plus.setText("+");
		plus.setFont(new Font("굴림", Font.PLAIN, 30));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2에 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터 타입은 무조건 String!!
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값:" + s1);
				System.out.println("t2값:" + s2);
				
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				//숫자로 변환한 값들을 더하자.
				int sum = i1 + i2;
				
				//처리한 결과를 사용자에게 보여줌.(출력)
				// result.setText(sum + "");
				String sum2 = String.valueOf(sum);//다른 타입을 String으로
				result.setText(sum2);
			}
		});
		
		
		
		
		// 레이아웃1
		FlowLayout flow = new FlowLayout();
		
		f.setSize(500, 700);
		
		f.getContentPane().setLayout(flow);
		l1.setIcon(img);
		l2.setText("숫자1");
		l3.setText("숫자2");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		f.getContentPane().add(plus);
		
		JButton plus_1 = new JButton();
		plus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값:" + s1);
				System.out.println("t2값:" + s2);
				
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				//숫자로 변환한 값들을 더하자.
				int min = i1 - i2;
				
				//처리한 결과를 사용자에게 보여줌.(출력)
				// result.setText(sum + "");
				String min2 = String.valueOf(min);//다른 타입을 String으로
				result.setText(min2);
			}
		});
		plus_1.setText("-");
		plus_1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(plus_1);
		
		JButton plus_1_1 = new JButton();
		plus_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값:" + s1);
				System.out.println("t2값:" + s2);
				
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				//숫자로 변환한 값들을 더하자.
				int mul = i1 * i2;
				
				//처리한 결과를 사용자에게 보여줌.(출력)
				// result.setText(sum + "");
				String mul2 = String.valueOf(mul);//다른 타입을 String으로
				result.setText(mul2);
			}
		});
		plus_1_1.setText("*");
		plus_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(plus_1_1);
		
		JButton plus_1_1_1 = new JButton();
		plus_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값:" + s1);
				System.out.println("t2값:" + s2);
				
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				//숫자로 변환한 값들을 더하자.
				int bre = i1 / i2;
				
				//처리한 결과를 사용자에게 보여줌.(출력)
				// result.setText(sum + "");
				String bre2 = String.valueOf(bre);//다른 타입을 String으로
				result.setText(bre2);
			}
		});
		plus_1_1_1.setText("/");
		plus_1_1_1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(plus_1_1_1);
		f.getContentPane().add(result);
		
		
		
		
		f.setVisible(true);
		

	}

}
