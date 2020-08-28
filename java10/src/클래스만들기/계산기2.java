package 클래스만들기;

public class 계산기2 {
	//각 부품의 기능을 정의할 때는 메서드를 쓴다.
	//메서드의 입력값 잠깐 저장할 용도로 선언된 변수, 메서드의
	//사용과 처리의 중간 다리역할을 변수 : 매개변수(paeameter, 파라메타)
	public void add(int x, int y) {//void == 없다.
		//x, y변수는 add메서드 지역에서만 쓸수 있는 지역변수
		//local 변수, 로컬변수
		//지역변수는 자동초기화 되지 않음.
		int result = x + y;
		System.out.println("합은" + result);
	}
	public void minus(int x, int y) {
		int result = x - y;
		System.out.println("마이나는" + result);
	}
	public int mul(int x, int y) {
		int result = x * y;
		return result;//30000
		//System.out.println("곱하기" + result);
	}
	public void div(int x, int y) {
		int result = x / y;
		System.out.println("나누기" + result);
	}
}
