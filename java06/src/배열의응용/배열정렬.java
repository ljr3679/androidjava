package 배열의응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		int[] a = {99, 10, 100, 88, 33, 24, 10, 77 };
		//배열 복사할때는 clone()함수 사용!
		//깊은 복사, 배열은 깊은 복사를 해야 한다.
		//깊은 복사를 해야 배열은 따로따로 만들어 진다.
		int[] a2 = a.clone();//clone() 배열의 복사
		for (int x : a) {
			System.out.print(x + "\t ");
		}
		for (int x : a2) {
		a2[0] = 999;
			System.out.print(x + "\t ");
		}
		System.out.println("\n---------------------");
		
		/*Arrays.sort(a); //오름차순 정렬(sort) ram=>cpu
		//파괴함수, 비파괴함수 
		for (int x : a) { //다시 cpu=>ram(원본을건드림)
			System.out.println(x + " ");
		}*/
	}

}
