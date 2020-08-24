package 배열의응용;

public class Test4 {

	public static void main(String[] args) {
		int[] num = { 11, 22, 33, 44 };
		int target = 33;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				System.out.println(target + "의 위치는" + (i + 1));
			}
		}

	}

}
