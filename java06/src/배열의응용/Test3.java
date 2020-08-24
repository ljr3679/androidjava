package 배열의응용;

import javax.swing.JOptionPane;

public class Test3 {

	public static void main(String[] args) {
		String[] text = new String[3];
		for (int i = 0; i < text.length; i++) {
			text[i] = JOptionPane.showInputDialog("과목 입력하세요");
		}
		System.out.println("**" + text[0] + "보다는" + text[1] + "**");

	}

}
