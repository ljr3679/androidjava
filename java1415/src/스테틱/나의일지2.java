package 스테틱;

import java.util.ArrayList;

import javax.swing.JButton;

public class 나의일지2 {
	
	public static void main(String[] args) {
		
		Day 나의일지1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count +"개 생성됨");
		System.out.println(Day.sum + "시간누적됨.");
		Day 나의일지2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count +"개 생성됨");
		System.out.println(Day.sum + "시간누적됨.");
		Day 나의일지3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count +"개 생성됨");
		System.out.println(Day.sum + "시간누적됨.");
		
		
		System.out.println("평균 시간은 : " + 나의일지1.getAvg()+"시간");
		System.out.println("평균 시간은 : " + Day.sum/Day.count);
		System.out.println("회사이름은 : " + Day.getName());
		System.out.println(나의일지1);
		System.out.println(나의일지2);
		System.out.println(나의일지3);
		
	}

}
