package 조건문;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		int target = 88;
		int ok = 0, no = 0;
		while (true) {
			String n = JOptionPane.showInputDialog("숫자를 입력하세요");
			int n1 = Integer.parseInt(n);
			no++;
			//비교연산자는 기본형만 사용할수 있다
			if (target == n1) {
				System.out.println("정답.끝낼께요");
				ok++;
				 break;
				// System.exit(0);
				// 큰지 작은지 힌트를 주세요
			} else if (target < n1) {
				System.out.println("아니에요 너무커요");
				
			} else {
				System.out.println("아니에요 작아요");
				
			}

		}
		System.out.println("시도횟수:" + no + "회");
		System.out.println("맞춘횟수:" + ok + "회");
	}

}
