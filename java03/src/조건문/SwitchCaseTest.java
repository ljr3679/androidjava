package 조건문;

public class SwitchCaseTest {

	public static void main(String[] args) {
		String food = "알밥";
		switch (food) {
		case "알밥" :
			System.out.println("분식집으로가요");
			break;
		case "국수" : 
			System.out.println("국시집으로가요");
			break;
		case "짜장면" : 
			System.out.println("중국집으로가요");
			break;
		case "냉면" : 
			System.out.println("일긷집으로가요");
			break;
		default: //if문의 else와 동일
			System.out.println("걍 안먹어요");
		
			
		}

	}

}
