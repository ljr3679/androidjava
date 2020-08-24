package 배열의응용;

import javax.swing.JOptionPane;

public class Test8 {

	public static void main(String[] args) {
		/*
		 * String[] names = {"블랙핑크", "유재석", "아이유", "이효리", "비"}; int[] num = new int[10];
		 * for (int i = 0; i < num.length; i++) { 
		 * num[0] = 5; num[1] = 3; num[2] = 0;
		 * num[3] = 1; num[4] = 1; } 
		 * for (int i = 0; i < names.length; i++) {
		 * System.out.println(names[i] + "는 " + num[i] + "표"); 
		 * }
		 * System.out.println("1등 : " + names[0]); System.out.println("2등 : " +
		 * names[1]);
		 */

		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int[] num = new int[5]; /* { 0, 0, 0, 0, 0 } */
		for (int i = 0; i < num.length; i++) {
			String choice = JOptionPane.showInputDialog("투표할사람 입결 0)블랙핑크 1)유재석 2)아이유 3)이효리 4)비");
			int choice2 = Integer.parseInt(choice);
			// 0~45 ! = not연산자
			if (!(choice2 < 0 || choice2 > 4)) {
				num[choice2]++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "번 " + names[i] +  "는 " + num[i] + "표");
		}
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i] == max) {
				System.out.println(i + " : " + names[i]);	
			}
			
		}
		
	}
}
