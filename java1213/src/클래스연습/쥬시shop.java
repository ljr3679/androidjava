package 클래스연습;

public class 쥬시shop {

	public static void main(String[] args) {
		계산기 cal = new 계산기();// cal이라는 변수생성해서 램에 저장 멤버변수 3개와 cal이라는변수1개 총4개 
		cal.color = "빨강"; //null  .(접근연산자)
		cal.price = 5000; //0
		cal.size = 11;    //0
		int 쥬스count = 5;
		int 커피count = 3;
		int sum = cal.더하다(쥬스count, 커피count);//입력값과 반환값이 있다
		//주소를 가지고 메서드를 쓸수 있음.
		//한잔에 3000원==> 전체금액 계산
		int sum2 = sum * 3000;
		System.out.println("당신이 지불할 금액은 : " + sum2);
		
		int 쥬스가격 = cal.곱하다(쥬스count, 3000);
		int 커피가격 = cal.곱하다(커피count, 3000);
		
		System.out.println("쥬스가격은 : " + 쥬스가격 + "원");
		System.out.println("커피가격은 : " + 커피가격 + "원");

		int 차이 = cal.빼다(쥬스가격, 커피가격);
		System.out.println("두음료간의 차이는" + 차이 + "원");
	}

}
