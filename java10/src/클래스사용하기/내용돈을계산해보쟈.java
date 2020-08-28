package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈을계산해보쟈 {

	public static void main(String[] args) {
		용돈계산기 cal = new 용돈계산기();
		int 기간 = 6;
		int 용돈 = 100000;		
		
		
		cal.mul(기간,용돈);
		int sum = cal.mul(기간,용돈);
		if(sum<500000) {
			System.out.println("전체금액은  = " + (sum+150000));
		}else {
			System.out.println("전체금액은  = " + sum );
		}
		
		
		int 상반기 = 600000;
		int 하반기 = 500000;
		cal.add(상반기, 하반기);
		
		
	}

}
