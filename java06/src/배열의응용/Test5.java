package 배열의응용;

import javax.swing.JOptionPane;

public class Test5 {

	public static void main(String[] args) {
		/*int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			String num1 = JOptionPane.showInputDialog("점수를 입력하세요");
			num[i] = Integer.parseInt(num1);
			System.out.println((i+1) + "번째는??" + num1);
		}*/
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		for (int x : num) {
			System.out.println(x + "");
		}
		System.out.println();
	}
}
