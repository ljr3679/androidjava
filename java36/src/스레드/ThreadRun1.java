package 스레드;

public class ThreadRun1 {

	public static void main(String[] args) {
		StarThread star = new StarThread();//star 객체만듬
		AtThread at = new AtThread();//at 객체만듦
		star.start();//start 동시 출력 
		at.start();

	}

}
