package 영화예매배열;

public class 이차원배열 {

	public static void main(String[] args) {
		// {0,0,0,0}
		// {0,0,0,0}
		int[][] num = new int[2][4];
		num[1][3] = 900; ///
		num[0][1] = 800;
		System.out.println(num.length); //행의 갯수, 1차원개수
		System.out.println(num[0].length); //0행의 개수
		System.out.println(num[1].length); //1행의 개수
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
