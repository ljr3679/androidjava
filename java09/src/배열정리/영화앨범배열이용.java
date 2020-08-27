package 배열정리;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now =2;//현재위치를 체크할수 있는 변수
	
	public static void main(String[] args) {
		
		// 영화제목목록, 이미지 목록, 감독목록, 평점 목록
		String[] titles = { "다만악에서구하소서", "남매의여름방", "터넷", "오케이마담", "메멘토" };
		String[] images = { "다만.jpg", "남매의.jpg", "터넷.jpg", "오케이.jpg", "메멘토.jpg" };
		String[] directors = { "홍원찬", "윤단비", "크리스퍼 놀란", "이철하", "크리스퍼 놀란" };
		double[] rates = { 11.1, 22.2, 33.3, 44.4, 55.5 };

		

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setTitle("나의 영화앨범");

		f.setSize(700, 700);
		f.getContentPane().setLayout(null);

		JLabel img = new JLabel();
		img.setIcon(new ImageIcon(images[2]));//////////////////////
		img.setBounds(94, 202, 270, 410);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("궁서", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(376, 257, 207, 57);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.RED);
		director.setFont(new Font("HY엽서L", Font.PLAIN, 25));
		director.setBounds(376, 337, 207, 57);
		f.getContentPane().add(director);

		JLabel lblNewLabel_4 = new JLabel("평점");
		lblNewLabel_4.setFont(new Font("궁서", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(376, 460, 207, 57);
		f.getContentPane().add(lblNewLabel_4);

		JLabel rate = new JLabel(rates[2]+ "");/////////////////
		rate.setForeground(Color.RED);
		rate.setFont(new Font("HY엽서L", Font.PLAIN, 25));
		rate.setBounds(376, 527, 207, 57);
		f.getContentPane().add(rate);
		
		JButton title = new JButton(titles[2]);
		title.setBackground(Color.ORANGE);
		title.setFont(new Font("HY헤드라인M", Font.PLAIN, 40));
		title.setBounds(146, 44, 372, 120);
		f.getContentPane().add(title);

		

		JButton btnNewButton = new JButton("<<");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now == 0) {
					now =5;
				}
				now--;//1
				title.setText(titles[now]);
				ImageIcon icon= new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(12, 30, 63, 618);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(now == 5) {
					now = -1;
				}
				now++;//1
				title.setText(titles[now]);
				ImageIcon icon= new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(609, 30, 63, 618);
		f.getContentPane().add(btnNewButton_1);

		
		f.setVisible(true);
	}
}
