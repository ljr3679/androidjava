package 배열응용;

import java.util.Random;

public class test1 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[100];
		for (int i = 0; i < 100; i++) {
			num[i] = r.nextInt(100);	
			
		}
		
		
		for (int x : num) {
			System.out.println(x);
		}
		int result = num[0] +  num[99];
		System.out.println("첫과끝 합은" + result);
	}

}
