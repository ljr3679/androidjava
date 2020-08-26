package 영화예매배열;

import java.util.Scanner;

public class 이차원배열3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * int[] num = new int[10];
		 * System.out.println("------------------------------"); for (int i = 0; i <
		 * num.length; i++) { System.out.print(i + "  "); }
		 * 
		 * 
		 * int[][] num2 = new int[3][10]; // System.out.println(num2.length); //행의 개수 3
		 * num2[0][4] = 1; num2[0][5] = 1; num2[0][6] = 1; for (int i = 0; i <
		 * num2.length; i++) { // 행을 3번(0~2) for (int j = 0; j < num2[i].length; j++)
		 * {// 각 행마다 열(0~9) System.out.print(num2[i][j] + "  "); } System.out.println();
		 * } int choice = scan.nextInt(); // choice변수는 좌석번호, 8번 if (choice == -1) {
		 * System.out.println("예매완료"); }
		 */
		int[] num = new int[10]; // 열
		int[][] num2 = new int[3][10]; // 형과열 선언
		char a = 'A';
		int count = 0;
		while (true) {
			System.out.println("------------------------------");
			System.out.print("   ");
			for (int i = 0; i < num.length; i++) {
				System.out.print((i+1) + "  ");
			}
			System.out.println();
			System.out.println("------------------------------");
			for (int i = 0; i < num2.length; i++) {
				System.out.print((char)(i+a) + "  ");
				for (int j = 0; j < num2[i].length; j++) {
					System.out.print(num2[i][j] + "  ");
				}
				System.out.println();
			}
			
			System.out.print("행입력(1~3), 종료(-1)>> ");
			int row = scan.nextInt();// 0
			if(row == -1) {
				System.out.println("<종료합니다.>");
				break;
			}
			System.out.print("열입력(1~10)>> ");
			int col = scan.nextInt();// 0
			if(col == -1) {
				System.out.println("<종료합니다.>");
				break;
			}
			//num2[row][col] = 1;
			
			if (num2[row-1][col-1] == 0) {
				num2[row-1][col-1] = 1;
				System.out.println("---------------------------");
				System.out.println("<예약을 완료했습니다.>");
				count++;
			} else {
				System.out.println("<다른자리 입력해주셔요.>");	
			}
			int sum = count*10000;
			System.out.println("예매수는 : " + count + "<결재금액은> : " + sum);
		}
		
	}

}
