package 배열의응용;

public class Test10 {

	public static void main(String[] args) {
		/*
		 * 국어 수학 과학 컴퓨터 영어 1학기 과목 점수리스트 100, 99, 77, 87, 66 
		 * 2학기 과목 점수는 1학기 점수에서 과학만 88, 영어만 55로 변경
		 * -1학기, 2학기 점수를 프린트 
		 * -점수가 변경된 과목의 수는? 
		 * -1학기, 2학기 중 평균이 더 높은 학기는? 
		 * -점수가 변경된 과목명은?
		 */
		//입력
		String[] s = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int[] j = { 100, 99, 77, 87, 66 };
		//깊은 복사
		int[] j2 = j.clone();
		System.out.println("학기\t" + "국어\t" + "수학\t" + "과학\t" + "컴퓨터\t" + "영어\t");
		System.out.print("1학기");
		for (int i = 0; i < j.length; i++) {
			System.out.print("\t" + j[i]);
		}
		System.out.print("\n");
		System.out.print("2학기");
		//2학기 점수 변경
		for (int i = 0; i < j2.length; i++) {
			j2[2] = 44;
			j2[4] = 55;
			System.out.print("\t" + j2[i]);
		}

		// 평균
		System.out.println("\n");
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < j.length; i++) {
			sum = sum + j[i];
			sum1 = sum / 5;
		}
		System.out.println("1학기평균" + sum1);
		System.out.print("\n");
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < j2.length; i++) {
			sum2 = sum2 + j2[i];
			sum3 = sum2 / 5;
		}
		System.out.println("2학기평균" + sum3);
		
		// 1,2학기 평균 어느게 높은가
		System.out.print("\n");
		if (sum1 > sum3) {
			System.out.println("1학기가 높음");
		} else if (sum1 < sum3) {
			System.out.println("2학기가 높음");
		}
		System.out.print("\n");
		
		// 변경된 과목명
		System.out.print("변경된 과목");
		int count = 0;
		for (int i = 0; i < j.length; i++) {
			if (j[i] != j2[i]) {
				System.out.print("\t" + s[i]);
				count++;
			}
			
		}
		System.out.print("\n");
		System.out.println("변경된 과목수" + count);
	}

}
