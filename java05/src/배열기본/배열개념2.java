package 배열기본;

public class 배열개념2 {

	public static void main(String[] args) {
				//배열은 일반적으로 같은 타입을 묶을때 사용!
				//다양한 타입을 묶을때는 배열을 쓰지 않음!
				//배열은 고정된 크기를 가진다 (크기조절 불가능)
		
		int[] win = new int[7];		
		win[0] = 27;
		win[1] = 28;
		win[2] = 29;
		win[3] = 30;
		win[4] = 31;
		win[5] = 32;
		win[6] = 33;
		
		for (int i = 0; i < win.length; i++) {
			System.out.println(i + 1 + "일차 온도는 : " + win[i] + "도");
		}

	}

}
