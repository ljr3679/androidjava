package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		//큰 <-- 작 : 자동형 변환
		int x = 100;  //int는 -21억~21억 까지, 4바이트
		byte y = 120; //byte는 -128~127 까지, 1바이트
		x = y;
		System.out.println("x=" + x);
		int z = 127;
		//작 <-- 큰 : 강제형 변환 ()을 사용
		//(자르고 싶은 데이터형)변수명
		byte w = (byte)z;
		
		int q = 1000;
		//byte t = q;
		//강제형 변환하는경우는
		//강제로 변환하고자 하는 타입범위에
		//값이 들어가야 한다
		
		//자동형변환
		byte a = 100 ;
		int b = x ;
		
		//형변환불가
		int c = 300;
		byte d = (byte)c;
		
		double e = 400; //8바이트
		int f = (int)e;		//강제형변환
		
		int g = 400;
		double h = g; //자동형변환

	}

}
