package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][]/*타입*/ seat = new int[3][5];
		//배열을 선언 하는순간 공간이 할당.
		//seat : 참조형변수(주소)
		//int[3][5] : 기본형 변수(값)
		//배열은 자동 초기화 int=>0
		System.out.println(seat);
		//	0 1 2 3 4
		//0 0 0 0 0 0
		//1 0 0 0 0 0
		//2 0 0 0 0 0
		seat[0][0] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
		seat[1][2] = 1;
		seat[2][1] = 1;
		System.out.println("행의갯수 : " + seat.length);
		for (int i = 0; i < seat.length; i++) {// 0, 1, 2(행의갰수)
			System.out.print(i+1+" ");
			for (int j = 0; j < seat[i].length; j++) {//0,,0, 0, 0, 0(열의갯수)
				System.out.print(seat[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
