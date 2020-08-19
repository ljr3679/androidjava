package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton btnNewButton = new JButton("나의 윈도우2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "눌러봐여");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);
	}

}
