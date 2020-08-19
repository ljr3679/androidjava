package 조건문;

import javax.swing.JOptionPane;

public class Test3 {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0, d = 0;

		while (true) {
			String n = JOptionPane.showInputDialog("인기투료를 선택해주세요 1)아이유, 2)유재석, 3)방탄, 4)종료");
			if (n.equals("1")) {
				System.out.println("아이유");
				a++;
			} else if (n.equals("2")) {
				System.out.println("유재석");
				b++;
			} else if (n.equals("3")) {
				System.out.println("방탄");
				c++;
			} else if (n.equals("4")) {
				System.out.println("4.죵료");
				d++;
				break;

			}
			
			
		}
		System.out.println("아이유" + a + "회");
		System.out.println("유재석" + b + "회");
		System.out.println("방탄" + c + "회");
		

	}

}
