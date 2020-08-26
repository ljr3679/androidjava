package 영화예매배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3};
		int[] n2 = {4, 5, 6, 7};
		int[][] n3 = new int[2][];
		n3[0] = n1;//2차원 배열의 첫번째에 1차원 배열 하나를 끼워 넣어줌.
		n3[1] = n2;
		
		for (int i = 0; i < n3.length; i++) {//행을 돈다
			for (int j = 0; j < n3[i].length; j++) {
				System.out.print(n3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
