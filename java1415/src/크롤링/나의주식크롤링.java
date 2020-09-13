package 크롤링;

import javax.swing.JFrame;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class 나의주식크롤링 {
	private static JTextField t1;
	

	public static void main(String[] args) {
		
		
		
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 182, 193));
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("HY헤드라인M", Font.BOLD, 40));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(131, 313, 412, 68);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextPane l1 = new JTextPane();
		l1.setFont(new Font("HY엽서M", Font.BOLD, 30));
		l1.setBounds(43, 422, 597, 229);
		f.getContentPane().add(l1);
		
		
		JButton b1 = new JButton("삼 성 전 자");
		b1.setFont(new Font("HY엽서M", Font.BOLD, 40));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=005930");
				
				try {
					Document doc = con.get(); 
					Elements list = doc.select("h2 > a");
					String name = list.get(0).text();
					System.out.println("회사이름 : " + name);
					Elements list2 = doc.select("span.code");
					String code = list2.get(0).text();
					t1.setText(code);
					Elements list3 = doc.select("div.today");
					Elements list4 = list3.select(".blind");
					String now = list4.get(0).text();//현재가
					String dif = list4.get(1).text();//차이
					String percent = list4.get(2).text();//증감비율
					l1.setText("현재가 : " + now +"\n"+"\n" +  "차이 : " + dif + "\n"+"\n" + "증감비율 : " + percent);
								 
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		b1.setBounds(131, 25, 412, 68);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("카 카 오 게 임 즈");
		b2.setFont(new Font("HY엽서M", Font.BOLD, 40));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
				
				try {
					Document doc = con.get(); 
					Elements list = doc.select("h2 > a");
					String name = list.get(0).text();
					System.out.println("회사이름 : " + name);
					Elements list2 = doc.select("span.code");
					String code = list2.get(0).text();
					t1.setText(code);
					Elements list3 = doc.select("div.today");
					Elements list4 = list3.select(".blind");
					String now = list4.get(0).text();//현재가
					String dif = list4.get(1).text();//차이
					String percent = list4.get(2).text();//증감비율
					l1.setText("현재가 : " + now +"\n"+"\n" +  "차이 : " + dif + "\n"+"\n" + "증감비율 : " + percent);
								 
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b2.setBounds(131, 113, 412, 68);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("신 풍 제 약");
		b3.setFont(new Font("HY엽서M", Font.BOLD, 40));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=019170");
				
				try {
					Document doc = con.get(); 
					Elements list = doc.select("h2 > a");
					String name = list.get(0).text();
					System.out.println("회사이름 : " + name);
					Elements list2 = doc.select("span.code");
					String code = list2.get(0).text();
					t1.setText(code);
					Elements list3 = doc.select("div.today");
					Elements list4 = list3.select(".blind");
					String now = list4.get(0).text();//현재가
					String dif = list4.get(1).text();//차이
					String percent = list4.get(2).text();//증감비율
					l1.setText("현재가 : " + now +"\n"+"\n" +  "차이 : " + dif + "\n"+"\n" + "증감비율 : " + percent);
								 
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		b3.setBounds(131, 203, 412, 68);
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("CODE : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 313, 108, 68);
		f.getContentPane().add(lblNewLabel);
		
		
		f.setVisible(true);
	}
}
