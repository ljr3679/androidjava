package 상속;

public class 슈퍼맨사용 {

	public static void main(String[] args) {
		슈퍼맨 s = new 슈퍼맨("클라스", 1000, 10000, true);
		s.age = 1000;
		s.name = "클라스";
		s.power = 10000;
		s.fly = true;
		
		System.out.println(s);
		//최종 재정의된 슈퍼맨의 toString()이 호출됨.
		s.eat();//사람
		s.run();//맨
		s.space();//슈퍼맨

	}

}
