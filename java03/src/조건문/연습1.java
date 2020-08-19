package 조건문;

import javax.swing.JOptionPane;

public class 연습1 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("두자리수를 입력하세요");
		int num3 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("한자리수를 입력하세요");
		int num4 = Integer.parseInt(num2);
		String num5 = JOptionPane.showInputDialog("계산할 방법을 선택하세요 +, -, *, / ");
		//int num1 = 10;
		//int num2 = 2;
		char operator = num5.charAt(0); 
		switch (operator) {
		case '+':
			System.out.println(num3 + num4);
			break;
		case '-':
			System.out.println(num3 - num4);
			break;
		case '*':
			System.out.println(num3 * num4);
			break;
		case '/':
			System.out.println(num3 / num4);
			break;
		
		}

	}

}
