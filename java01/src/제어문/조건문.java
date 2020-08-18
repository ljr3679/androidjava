package 제어문;

import java.util.concurrent.locks.Condition;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		if (x >= 200) {// 비교연산자가 반드시 들어가야함.
			System.out.println("200보다 크근유");
		} else {
			System.out.println("200보다 작근유");
		}

	}
}
