package 상속;



public class Coffe {

	public static void main(String[] args) {
		CoffeeTruck ct = new CoffeeTruck();
		ct.name = "케냐";
		ct.kind = "강남";
		ct.speed = "100km";
		ct.time = "1시간 30분";
		
		System.out.println(ct);
		ct.start();
		ct.run();
		ct.Delivery();
			

	}

}
