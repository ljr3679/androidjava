package jaja01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JLabel l0 = new JLabel();//ȸ������
		l0.setFont(new Font("����", Font.BOLD, 40));
		l0.setHorizontalAlignment(SwingConstants.CENTER);
		l0.setBounds(171, 10, 317, 59);
		l0.setBackground(Color.YELLOW);
		l0.setForeground(Color.BLACK);
		l0.setText("ȸ������");
		JLabel l1 = new JLabel("���̵� : ");
		l1.setFont(new Font("���� ���", Font.BOLD, 25));
		l1.setBounds(65, 121, 126, 53);
		JLabel l2 = new JLabel("��й�ȣ : ");
		l2.setFont(new Font("���� ���", Font.BOLD, 25));
		l2.setBounds(65, 197, 126, 53);
		JLabel l3 = new JLabel("��й�ȣ Ȯ�� : ");
		l3.setFont(new Font("���� ���", Font.BOLD, 25));
		l3.setBounds(65, 271, 204, 53);
		JLabel l4 = new JLabel("�̸� : ");//�̸�
		l4.setFont(new Font("���� ���", Font.BOLD, 25));
		l4.setBounds(65, 345, 126, 53);
		JLabel l5 = new JLabel("������� : ");//�������
		l5.setFont(new Font("���� ���", Font.BOLD, 25));
		l5.setBounds(65, 420, 126, 53);
		JLabel l6 = new JLabel("��ȭ��ȣ : ");//��ȭ��ȣ
		l6.setFont(new Font("���� ���", Font.BOLD, 25));
		l6.setBounds(65, 495, 126, 53);
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.WHITE);
		t1.setBounds(290, 121, 204, 53);
		JTextField t2 = new JTextField(10);
		t2.setBounds(290, 197, 204, 53);
		JTextField t3 = new JTextField(10);
		t3.setBounds(290, 271, 204, 53);
		JTextField t4 = new JTextField(10);
		t4.setBounds(290, 345, 204, 53);
		JTextField t5 = new JTextField(10);
		t5.setBounds(290, 420, 204, 53);
		JTextField t6 = new JTextField(10);
		t6.setBounds(290, 495, 204, 53);
		JButton b1 = new JButton("�����ϱ�");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "������ ���ϵ帳�ϴ�.!!");
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 25));
		b1.setBounds(218, 587, 234, 39);
		JButton b2 = new JButton("�ߺ�Ȯ��");
		b2.setFont(new Font("����", Font.BOLD, 14));
		b2.setBounds(521, 131, 103, 25);
		
		
		
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(l0);
		f.getContentPane().add(l1);
		f.getContentPane().add(b2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(l3);
		f.getContentPane().add(t3);
		f.getContentPane().add(l4);
		f.getContentPane().add(t4);
		f.getContentPane().add(l5);
		f.getContentPane().add(t5);
		f.getContentPane().add(l6);
		f.getContentPane().add(t6);
		f.getContentPane().add(b1);
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
