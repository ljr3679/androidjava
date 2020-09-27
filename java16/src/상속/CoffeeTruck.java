package 상속;

public class CoffeeTruck extends Truck {
	String time;

	public void Delivery() {
		System.out.println("배달하다.");

	}

	@Override
	public String toString() {
		return "CoffeeTruck [time=" + time + ", speed=" + speed + ", name=" + name + ", kind=" + kind + "]";
	}
	
}