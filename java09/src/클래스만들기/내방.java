package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		//. ==> 접근 연산자
		휴대폰 p1 = new 휴대폰();//틀을 찍어냄.자동 초기화 
		//p1 변수 생성 ==>멤버변수들을 가르키는 주소가  들어감
		//color, size, company 멤버 변수 복사 ==>자동초기화
		//참조형은 =>null  기본형은 =>0   논리형은 =>false
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";
		
		System.out.println("p1 휴대폰의 색은 " + p1.color);
		System.out.println("p1 휴대폰의 크기은 " + p1.size);
		System.out.println("p1 휴대폰의 회사은 " + p1.company);
		p1.문자하다();
				
		System.out.println("-----------------------");
				
		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";
		
		System.out.println("p2 휴대폰의 색은 " + p2.color);
		System.out.println("p2 휴대폰의 크기은 " + p2.size);
		System.out.println("p2 휴대폰의 회사은 " + p2.company);
		p2.전화하다();
		
		Dog d1 = new Dog();
		d1.size = "대형" ;
		d1.jong = "치와와";
		d1.color = "블랙";
		
		System.out.println("d1 강아지의 크기는 " + d1.size);
		System.out.println("d1 강아지의 종류는 " + d1.jong);
		System.out.println("d1 강아지의 색깔은 " + d1.color);
		d1.짖다();
		d1.자다();
		
		System.out.println("-----------------------");
		
		Dog d2 = new Dog();
		d2.size = "소형" ;
		d2.jong = "말티즈";
		d2.color = "화이트";
		
		System.out.println("d2 강아지의 크기는 " + d2.size);
		System.out.println("d2 강아지의 종류는 " + d2.jong);
		System.out.println("d2 강아지의 색깔은 " + d2.color);
		d2.짖다();
		d2.자다();
		
				
		
	}

}
