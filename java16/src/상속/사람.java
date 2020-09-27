package 상속;

public class 사람{//extends Object : 상속, 안써도 됨!!
	//멤버변수, 멤버 메서드
	String name;
	int age;
	
	
	//파라메터있는 생성자를 정의하게 되면,
	//파라메터없는 기본 생성자는 자도으로 만들어 지지 않는다.
	//new 사람(); //물가
	public 사람(String name, int age) {//이걸 만들면 기본생성자 만들어 지지 않음.
		super(); //Object(); 부모의 기본 생성자 호출
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

	
}
