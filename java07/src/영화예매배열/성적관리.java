package 영화예매배열;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 성적관리 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("-------------------------------");
			System.out.print("학번 ");
			String a = scan.next();
			System.out.print("이름");
			String b = scan.next();
			System.out.print("1중을 입력하세요 ");
			int c = scan.nextInt();
			System.out.print("1기을 입력하세요 ");
			int d = scan.nextInt();
			System.out.print("2중을 입력하세요 ");
			int e = scan.nextInt();
			System.out.print("2기을 입력하세요 ");
			int f = scan.nextInt();
			sum = c + d;
			sum1 = e + f;
			System.out.println("-------------------------------");
			System.out.println("1학기  " + "\t2학기  ");
			System.out.println(sum + "\t" + sum1);
			if (sum > sum1) {
				System.out.println("1학기 성적이 좋습니다.");
			} else if (sum < sum1) {
				System.out.println("2학기 성적이 좋습니다.");
			} else {
				System.out.println("똑같아요.");
			}
		}

	}

}
