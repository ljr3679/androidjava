package 조건문;

import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		while (true) {
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정");
			if (data.equals("ok")) {
				System.out.println("긍정.끝낼께요");
				System.exit(0);
			} else if (data.equals("no")) {
				System.out.println("부정");
			} else {
				System.out.println("몰라");
			}

		}

	}
}
