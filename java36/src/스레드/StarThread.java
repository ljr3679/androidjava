package 스레드;

import java.lang.Thread;

public class StarThread extends Thread {
	//멤버변수, 멤버메서드
	@Override //오버라이드, 재정의
	public void run() {//
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
		}
	}
}
