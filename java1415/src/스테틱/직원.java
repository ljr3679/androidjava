package 스테틱;

public class 직원 {
	String name;//이름
	String gender;//성별
	int age;//나이
	static int count = 0;//카운트
	static int sum = 0;//더한값
	

	public 직원(String name, String gender, int age) {
		super();
		count++;//증감
		sum = sum + age;//나이의합
		this.name = name;//이름
		this.gender = gender;//성별
		this.age = age;//나이
	}
	
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ""
				+ ", age=" + age + "]";//반환값
	}


	

}
