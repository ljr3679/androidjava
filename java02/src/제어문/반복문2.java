package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
	/*	// 정해진 횟수만큼 반복해보자.
		int start = 1;//시작값
		int end = 5;//끝값
		int add = 1;//증가값
		while(start <= end) { 
			System.out.println(start);
			start = start + add;
		}*/
		
	/*	int st = 100;//시작값
		int en = 1;//끝값
		int ad = 1;//증가값
		while(st >= en) { //시작값이 끝값보다 작거나 같을때 까지 반복
			System.out.println(st); //출력 
			//st = st - ad; //cpu에서 계산 100에서 -1씩 감소 ram 초기화
			st--; //증감연산자
		} */
		
		int st1 = 5;//시작값
		int en1 = 10;//끝값
		int ad1 = 1; //증가값
		while(st1 <= en1) {//시작값이 끝값보다 크거나 같을때 까지 반복
			System.out.println(st1);//출력 
			//st1 = st1 + ad1;//cpu에서 계산 5에서 1씩 증소 ram 초기화
			st1++;//증감연산자
		} 
		
	/*	int st2 = 1;//시작값
		int en2 = 100;//끝값
		int ad2 = 2; //증가값
		while(st2 <= en2) {//시작값이 끝값보다 크거나 같을때 까지 반복
			System.out.println(st2);//출력 
			st2 = st2 + ad2;//cpu에서 계산 1에서 100까지  2씩증가 ram 초기화
		}*/
	}
}





