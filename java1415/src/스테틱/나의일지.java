package 스테틱;

import java.util.ArrayList;

public class 나의일지 {
	
	public static void main(String[] args) {
		Day 나의일지1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + " " + 나의일지1);					
		Day 나의일지2 = new Day("여행", 15, "강원도");			
		System.out.println(Day.count + " " + 나의일지2);
		Day 나의일지3 = new Day("운동", 10, "피트니스");
		System.out.println(Day.count + " " + 나의일지3);
		
		ArrayList<Day> list = new ArrayList();
		list.add(나의일지1);
		list.add(나의일지2);
		list.add(나의일지3);
		파일로저장 file = new 파일로저장();
		file.save(list);
	}

}
