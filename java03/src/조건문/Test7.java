package 조건문;

import javax.swing.JOptionPane;

public class Test7 {

	public static void main(String[] args) {
		String no = JOptionPane.showInputDialog("사원번호");
		char num = no.charAt(0);
		switch (num) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발");
			break;

		default:
			System.out.println("해당부서없음");
			break;	
		}
		String num1 =no.substring(1,4);
		//인덱스 1~3범위 추출이면 substring(1,4)써줌.
		//endIndex 는3보다 1큰 5를 써주어야함.
			System.out.println("고유번호="+ num1);
		
	}

}
