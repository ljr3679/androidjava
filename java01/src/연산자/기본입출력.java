package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 창을 띄워서 입력을 받아보자
		// 창을 띄워서 출력을 해보자
		// 자주사용하는 것은 부품의 대문자를 그대로 쓴다.!
		// 특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할때 
		// 부품을 지정함.
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		// name변수를 창을 띄워서 입력 ram에 저장
		System.out.println("당신의 이름은?" + name);
		// 입력후 결과값 출력 cpu출력 실행
		String age = JOptionPane.showInputDialog("당신의 나이는?");
		// age변수를 창을 띄워서 입력  ram에 저장
		// 키보드로 입력한 데이터 타입은 무조건 String!
		// String으로 저장된 데이터를 int/String 쓸지는 내가결정!
		// 계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야함.
		// 숫자로 바꿔보자!!
		int age2 = Integer.parseInt(age);
		// 나이를 정수 int 정수 변환 
		int lastAge = age2 - 1;
		// 나이계산 (변수값 -1)
		System.out.println("당신의 작년나이는?" + lastAge);
		// 결과값 출력
	}

}





