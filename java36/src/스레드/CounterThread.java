package 스레드;

public class CounterThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	public void view() {
//		super.run();//super. 부모클래스의 있는 것을 호출할때.
//		System.out.println("내용을 프린트");
//	}
}
