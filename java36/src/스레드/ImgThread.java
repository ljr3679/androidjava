package 스레드;

public class ImgThread extends Thread {
	@Override
	public void run() {
		String[] img = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
		for (int i = 0; i < img.length; i++) {
			System.out.println("이미지 : " + img[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
