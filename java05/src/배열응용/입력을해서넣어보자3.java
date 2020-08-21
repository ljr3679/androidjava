package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력을해서넣어보자3 {

	public static void main(String[] args) {

		Random r = new Random();// 아무거나 만들어 주는클래스
		int[] data = new int[10000];
		for (int i = 0; i < 10000; i++) {
			data[i] = r.nextInt(100);
		}
		for (int x : data) {
			System.out.println(x);
		}
	}

}
