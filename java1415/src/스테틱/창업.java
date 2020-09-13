package 스테틱;

public class 창업 {
	public static void main(String[] args) {
		
		직원 창업1=new 직원("임아무", "남", 24);//직원1의 인적사항
		System.out.println(직원.count + "명 고용!!");//채용할때 마다 카운트
		직원 창업2=new 직원("김아무", "여", 23);
		System.out.println(직원.count + "명 고용!!");
		직원 창업3=new 직원("박아무", "남", 25);
		System.out.println(직원.count + "명 고용!!");
		
		System.out.println("직원 평균 나이는 : " + (직원.sum/직원.count));//직원의 평균 나이 
		System.out.println(창업1);//직원 인적사항 출력
		System.out.println(창업2);
		System.out.println(창업3);
	}
}
