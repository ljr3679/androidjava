package 배열의응용;

public class Test1 {

	public static void main(String[] args) {
		/*
		  int[] num = {55, 11, 22, 99, 33}; 
		  int min = num[0]; 
		  for (int i = 0; i <num.length; i++) {
		   	if(num[i] < min) {
		    	min = num[i];
		  		System.out.println("min 값은??" + min); 
		  	}
		  
		  }
		 */

		int[] num = { 55, 11, 22, 99, 33, 99, 99 };
		// 해당 인덱스까지의 최대값을 저장해두기로 함.
		int max = num[0]; // 55
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				System.out.println("max 값은==" + max);
			}
		}
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				System.out.println(max + "의 위치는==" + (i + 1));
				count++;
			}
		}
		System.out.println(max + "의갯수는==" + count);
	}

}
