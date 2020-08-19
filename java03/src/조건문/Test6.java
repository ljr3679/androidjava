package 조건문;

public class Test6 {

	public static void main(String[] args) {
		int mon = 3;
		switch (mon) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;	
		default:
			System.out.println("31일까지");
			break;
		}

	}

}
