package 레시피;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class re {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		
		
		
		
		f.setSize(700, 700);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("[양념]간장(싱겁게 드시는 분들 조절해주세요) 8~11큰술 고추장4큰술고춧가루2큰술\n [양념2]간장(싱겁게 드시는 분들 조절해주세요) 8~11큰술 고추장4큰술고춧가루2큰술\n");
		textArea.setColumns(30);
		textArea.setRows(5);
		f.getContentPane().add(textArea);
	}

}
