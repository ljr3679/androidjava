package 상속;

public class Truck extends Car {
	String speed;

	public void run() {
		start();// 부모의 메서드는 자식 클래스에서 바로 호출 가능!!
		System.out.println("빨리 달리다.");

	}

	@Override
	public String toString() {
		return "Truck [speed=" + speed + ", name=" + name + ", kind=" + kind + "]";
	}

}
