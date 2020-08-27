package 배열정리;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 중국집 {
	private static JTextField count;
	static int count1 = 0;//짜장 수량
	static int count2 = 0;//짬뽕 수량
	static int count3 = 0;//볶음 수량
	static int count4 = 0;//전체 수량
	static int total1 = 0;//총 가격
	private static JTextField total;
	public static void main(String[] args) {
		String[] images1 = {"짜장.jpg","짬뽕.jpg","볶음.jpg"};//이미지 배열
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(240, 255, 240));

		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		JLabel img1 = new JLabel("New label");
		img1.setIcon(new ImageIcon(images1[0]));
		img1.setBounds(56, 154, 570, 350);
		f.getContentPane().add(img1);
		
		JButton btnNewButton = new JButton("짜 장");
		btnNewButton.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(255, 255, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images1[0]);//짜장 이미지 삽입
				img1.setIcon(icon);//img1에 이미지 출력
				count1++;//짜장 카운트
				count4 = count1 + count2 + count3;//갯수 확인
				total1 = (count1*4000 + count2*4500 + count3*5000);//가격확인
				count.setText(count4 + "개");//count에 갯수 출력
				total.setText(total1 + "원");//total에 가격 출력
				
			}
		});
		btnNewButton.setBounds(12, 20, 117, 54);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짬 뽕");
		btnNewButton_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images1[1]);
				img1.setIcon(icon);
				count2++;
				count4 = count1 + count2 + count3;
				total1 = (count1*4000 + count2*4500 + count3*5000);
				count.setText(count4 + "개");
				total.setText(total1 + "원");
			}
		});
		btnNewButton_1.setBounds(150, 20, 117, 54);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("볶 음");
		btnNewButton_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(204, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(images1[2]);
				img1.setIcon(icon);
				count3++;
				count4 = count1 + count2 + count3;
				total1 = (count1*4000 + count2*4500 + count3*5000);
				count.setText(count4 + "개");
				total.setText(total1 + "원");
			}
		});
		btnNewButton_2.setBounds(290, 20, 117, 54);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setFont(new Font("HY엽서L", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(419, 30, 91, 34);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField("개");
		count.setBackground(new Color(230, 230, 250));
		count.setHorizontalAlignment(SwingConstants.RIGHT);
		count.setFont(new Font("HY엽서L", Font.BOLD, 18));
		count.setBounds(522, 23, 138, 54);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("지불할 총 금액");
		lblNewLabel_2.setFont(new Font("HY엽서L", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(30, 564, 172, 54);
		f.getContentPane().add(lblNewLabel_2);
		
		total = new JTextField();
		total.setBackground(new Color(230, 230, 250));
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setFont(new Font("HY엽서L", Font.BOLD, 18));
		total.setText("      원");
		total.setBounds(258, 565, 380, 54);
		f.getContentPane().add(total);
		total.setColumns(10);
		
		f.setVisible(true);
	}
}
