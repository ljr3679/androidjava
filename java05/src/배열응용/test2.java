package 배열응용;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[1000];
		int[] me = new int[1000];
		for (int i = 0; i < me.length; i++) {
			data[i] = r.nextInt(4);
			me[i] = r.nextInt(4);
		}
		System.out.println("문항/정답 /내답/처리 ");

		int count = 0;
		for (int i = 0; i < me.length; i++) {
			String result = "오답";
			if (data[i] == me[i]) {
				result = "정답";
				count++;
			}
			System.out.println(i + " / " + data[i] + " / " + me[i] + " / " + result);
		}
		System.out.println("점수 : " + count);
	}

}
