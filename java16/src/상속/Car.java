package 상속;

public class Car extends Object{
	String name;
	String kind;
	
	
	public void start() {
		// 부모의 메서드는 자식 클래스에서 바로 호출 가능!!
		System.out.println("시동을 걸다.");
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", kind=" + kind + "]";
	}
	
	

}
