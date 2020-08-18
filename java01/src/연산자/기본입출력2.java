package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두수를 입력받아서
		// ctrl + alt + 화살표아래 : 한줄복사
		// alt + 화살표방향 : 이동
		
		// 더한 결과값을 출력
		String num = JOptionPane.showInputDialog("첫번째숫자는?");
		System.out.println(num);
		String num1 = JOptionPane.showInputDialog("두번째숫자는?");
		System.out.println(num1);
		// int로 변환한 후 
		int num3 = Integer.parseInt(num);
		int num4 = Integer.parseInt(num1);
		// 더한 다음
		int num5 = num3 + num4;
		// 더한 결과값을 출력
		System.out.println("결과는??"+num5);
	}

}
