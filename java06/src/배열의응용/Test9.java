package 배열의응용;

import javax.swing.JOptionPane;

public class Test9 {

	public static void main(String[] args) {
		String[] f = { "아버지", "어머니", "형", "나", "동생" };
		int[] a = { 100, 88, 33, 24, 10 };
		double[] k = { 177.5, 152.2, 190.3, 167.7, 155.3 };
		System.out.println("우리집 식구 정리");
		System.out.println("-----------------------");
		System.out.println("이름" + "\t" + "나이" + "\t" + "키");
		System.out.println("-----------------------");
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i] + "\t" + a[i] + "\t" + k[i]);
		}

	}

}
