package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 좌석마다 예매상황을 저장할 공간들
		int count = 0; // 예매 개수
		while (true) {
			System.out.println("---------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("---------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}

			System.out.println();
			System.out.print("원하는 좌석을 입력하세요(종료-1)>> ");
			int choice = scan.nextInt(); //choice변수는 좌석번호, 8번
			if (choice == -1) {
				System.out.println("예매완료");
				break;

			}
			if (seat[choice-1] == 0) {
				seat[choice-1] = 1;
				System.out.println("---------------------------");
				System.out.println("<예약을 완료했습니다.>");
				System.out.println("");
				count++;
			} else {
				System.out.println("---------------------------");
				System.out.println("<이미 예약 되었어요  다른 자리 선택해주셔요!!>");
			}
			int sum = 10000 * count;
			System.out.println("---------------------------");
			System.out.println(count + "개의 좌석이 예매 되었습니다]" + " [결제금액] : " + sum);

			// 선택한 번호의 좌석을 에약처리
			// 1) 이미 예약된 자리는 예약불가.. 다른자리 선택하라고 알랴 주세요
			// 2) 종료시 몇좌석이 예매가 되었는지 프린트.. 한장당 10000원 결제금액 프린트
			// 3) 좌석번호가 1번부터 시작되게 해주세요
			// seat[choice] = 1;
			// System.out.println("예약을 완료했습니다.");

		}

	}

}
