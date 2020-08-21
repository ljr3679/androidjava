package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class 레시피1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 99));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setText("추 천 메 뉴");
		ImageIcon img = new ImageIcon("boodea.jpg");
		JLabel l2 = new JLabel();
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		l2.setFont(new Font("굴림", Font.PLAIN, 20));
		ImageIcon img1 = new ImageIcon("chicken.jpg");
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.PLAIN, 20));
		l3.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon img2 = new ImageIcon("ddug.jpg");
		JLabel l4 = new JLabel();
		l4.setFont(new Font("굴림", Font.PLAIN, 20));
		l4.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		FlowLayout flow = new FlowLayout();
		f.setSize(700, 700);
		f.getContentPane().setLayout(flow);
		l2.setIcon(img);
		l2.setText("부대찌개 양념 만드는법 홀릭되는 맛임") ;
		l3.setIcon(img1);	
		l3.setText("닭볶음탕 진짜진짜 황금레시피 알려 드려요") ;
		l4.setIcon(img2);	
		l4.setText("만드는 방법은 너무 간단한데 맛있어서 놀랜답니다!") ;
		
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);// 부대 이미지
		f.getContentPane().add(l3);// 닭도리 이미지
		f.getContentPane().add(l4);// 떡볶이 이미지
		
		
		
		
		
		f.setVisible(true);

	}

}
