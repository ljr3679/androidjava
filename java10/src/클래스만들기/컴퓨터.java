package 클래스만들기;

public class 컴퓨터 {
	// 상태정의 => 멤버변수, 전역변수(global변수, 글로벌 변수)
	// 객체 생성 후, 멤버변수는 객체마다 다 별도로 복사되게 된다.
	// 복사된 멤버변수에는 생성된 객체의 실제값이 들어가게 된다.
	// 멤버변수는 실제 값이 들어가는 변수(인스턴스 변수)
	// 전역변수 => 클래스 전체 영역에서 사용가능
	// 변수는 선언의 위치가 중요!
	// 선언의 위치가 이변수를 쓸수 있는 범위를 결정

	public int price;//
	public String company; // 멤버메서드 다른패키지일경우 변수앞에 public 을써주면 사용가능
	public int size;// 멤버변수

	// 동작정의 => 멤버메서드
	public void internet() {
		System.out.println("인터넷하다.");
	}

	public void doc() {
		System.out.println("문서작성을하다.");
	}

	// 원래 toString()는 기초형이며 기초형값 , 참조형이며 주소를 찍어주는
	// toString() 를 내가 원하는 프린트모양대로 변경해서 사용할수 있다.
	// eclipse의Source에가서 toString()메서드 코드자동생성
	@Override
  

	public String toString() {
		return "price=" + price + "company=" + company + "size=" + size;
	}
}
