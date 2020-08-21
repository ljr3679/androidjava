package jaja01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ∑πΩ√««2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 204));
		JLabel l0 = new JLabel("√ﬂ√µ∏ﬁ¥∫");
		l0.setBounds(12, 23, 662, 47);
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setFont(new Font("±º∏≤", Font.BOLD, 40));
		l0.setForeground(Color.RED);
		
		JButton b1 = new JButton();//¥ﬂµµ∏Æ≈¡
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
		
		JButton bb1 = new JButton("¥ﬂµµ∏Æ≈¡");
		bb1.setBounds(52, 262, 150, 23);
		JButton bb2 = new JButton("∫Œ¥Î¬Ó∞≥");
		bb2.setBounds(263, 262, 150, 23);
		JButton bb3 = new JButton("¡¶¿∞∫∫¿Ω");
		bb3.setBounds(485, 262, 150, 23);
		JButton bb4 = new JButton("º“∫“∞Ì±‚");
		bb4.setBounds(52, 532, 150, 23);
		JButton bb5 = new JButton("ø¿¬°∫∫¿Ω");
		bb5.setBounds(263, 532, 150, 23);
		JButton bb6 = new JButton("º“¿Â¡∂∏≤");
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
		
		
		f.setVisible(true);
	}

}
