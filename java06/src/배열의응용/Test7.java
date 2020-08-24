package 배열의응용;

public class Test7 {

	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		int imsi = num[0]; //imsi <= 66
		num[0] = num[3];   //num[0] <= 99
		num[3] = imsi;     //num[3] <= imsi
		for (int x : num) {
			System.out.println(x + " ");
		}
		System.out.println();

	}

}
