package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
		// 1.  2개의 숫자를 입력받아서 사칙연산을 해보세요.
		//데이터 : 입력
		String x= JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		String y= JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		//2.처리
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		int sum = x1 + y1;
		//3. 결과출력
		System.out.println(x1 + y1);
		System.out.println(x1 - y1);
		System.out.println(x1 * y1);
		System.out.println(x1 / y1);
		
		
		
		// 2. 숫자 입력을 2개 받아서, 시작값이 5, 종료값 1000이면 5~1000까지 프린트
		String a= JOptionPane.showInputDialog("첫번째 숫자를 입력하세요");
		String b= JOptionPane.showInputDialog("두번째 숫자를 입력하세요");
		int a1 = Integer.parseInt(a);//5
		int b1 = Integer.parseInt(b);//10000
		for (int i = a1; i <b1 ; i++) {
			System.out.println(i);
			
		}
		
		// 3. 숫자1개를 입력받고, 문자1개를 입력받아서 입력한 숫자개수만큰 문자를 프린트
		String c= JOptionPane.showInputDialog("반복할 숫자를 입력하세요");
		String d= JOptionPane.showInputDialog("문자를 입력하세요");
		int c1 = Integer.parseInt(c);//
		
		for (int i = 0; i <c1 ; i++) {
			System.out.print(d);
			
		}
			
		}
		
	}


