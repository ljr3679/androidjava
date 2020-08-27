package 배열정리;

public class 이차원배열3 {

	public static void main(String[] args) {
		int[][] num = new int[4][];
		
		int[] n1= {50,60,70,80,90};
		int[] n2= {66,77,88};
		int[] n3= {10,20,30,40};
		int[] n4= {20,30};
		num[0] = n1;
		num[1] = n2;
		num[2] = n3;
		num[3] = n4;
		
		String[] g1= {"국어", "영어", "수학", "과학"};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(g1[i] + "  ");
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
