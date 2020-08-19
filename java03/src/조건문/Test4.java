package 조건문;

import javax.swing.JOptionPane;

public class Test4 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		while (true) {
			String n = JOptionPane.showInputDialog("1)입금, 2)출금, 3)잔고, 4)종료");
			if (n.equals("1")) {
				String x = JOptionPane.showInputDialog("입금");
				a = Integer.parseInt(x);
				System.out.println(a);

			} else if (n.equals("2")) {
				String y = JOptionPane.showInputDialog("출금");
				b = Integer.parseInt(y);
				System.out.println(b);
				
			} else if (n.equals("3")) {
				c= a - b;
				System.out.println(c);
				
			} else if (n.equals("4")) {
				System.out.println("종료");
				break;

			}
		}
	}
}
