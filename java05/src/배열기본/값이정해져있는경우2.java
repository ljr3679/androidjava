package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// 이름(string), 나이(int), 성별(char), 아침(boolean), 몸무게(double)
		String[] n = { "이길동", "김길동", "박길동", "최길동", "장길동" };
		for (String x : n) {
			System.out.println(x);
		}
		/*for (int i = 0; i < n.length; i++) {
			System.out.println("이름은 : " + n[i]);
		}*/
		int[] a = { 24, 30, 22, 12, 33 };
		for(int x : a) {
			System.out.println(x);
		}
		/*for (int i = 0; i < a.length; i++) {
			System.out.println("나이는 : " + a[i]);
		}*/
		char[] s = { '남', '여' };
		for (char x : s) {
			System.out.println(x);
		}
		/*for (int i = 0; i < s.length; i++) {
			System.out.println("성별은 : " + s[i]);
		}*/
		boolean[] b = { true, false };
		for(boolean x : b) {
			System.out.println(x);
		}
		/*for (int i = 0; i < b.length; i++) {
			System.out.println("먹었나요 : " + b[i]);
		}*/
		double[] k = { 30, 40, 50, 60, 70 };
		for (double d : k) {
			System.out.println(d);
		}
		/*for (int i = 0; i < k.length; i++) {
			System.out.println("몸무게는 : " + k[i]);
		}*/
		for (int i = 0; i < n.length; i++) {
			System.out.println("a"+"n"+"s"+"b");
		}

	}

}
