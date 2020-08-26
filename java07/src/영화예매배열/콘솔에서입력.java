package 영화예매배열;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// 콘솔에서 입력: Scanner
		// 모든 입력의 데이터 타입은 String!!
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력>> ");
		String x = scan.next();// 입력하면 가져다 주는것
		System.out.println("이름은: " + x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt(); // int<-String입력
		System.out.println("내년나이는" + (y + 1) + "년");

		System.out.print("현재키 입력>> ");
		double y1 = scan.nextDouble();
		System.out.println("당신의키는: " + y1 + "cm");

		System.out.print("현재키 입력>> ");
		double y2 = scan.nextDouble();
		System.out.println("내년키는: " + (y2 + 20) + "cm");

		System.out.print("밖에 비오니?>> ");
		boolean y3 = scan.nextBoolean();
		if (y3 == true) {
			System.out.println("우산챙기라");
		} else {
			System.out.println("우산 놓고가라");
		}
		
		System.out.print("당신의 목표는>> ");
		scan.nextLine();//한번 버려야함
		String life = scan.nextLine(); //엔터치기전까지의 문장
		System.out.println("목표는: " + life);
	}
}
