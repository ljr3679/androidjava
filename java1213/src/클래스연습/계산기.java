package 클래스연습;

public class 계산기 {
//	계산기
//	프로그램을하려고 하는 대상은
//	2가지 특징을 가지고 있음.
//	1)눈에 보이는 속성 : 색, 가격, 크기
	//=>멤버변수(전역변수, global변수, 클래스 전체영역에서 사용가능)
	//=>자동초기화
	String color; //참조형변수(null)
	int price; //기본형변수(0)
	int size; //기본형변수(0)
//	2)동작: 더하다, 빼다, 곱하다, 나누다
	//=>멤버메서드변수(입력값, 반환값 유무)
	public int 더하다(int c1, int c2) {//메서드(기능) 정의  -void위치:반환값  (): 입력값
		//매개변수(parameter)
		//void: 없다, 반환값이 없다.
		int result = c1 + c2;
		return result;
	}
	public int 빼다(int c1, int c2) {
		int result = c1 - c2;
		return result;
		
	}
	public int 곱하다(int c1, int c2) {
		int result = c1 * c2;
		return result;
	
	}
	public void 나누다() {
	
	}
}
