package 제어문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
	/*	//입력
		String ice = JOptionPane.showInputDialog("음료를 선택하세여");		
		//처리
		if(ice.equals("아이스크림")){ 
			System.out.println("뚜레쥬르");
			
		}else if(ice.equals("아이스커피")) {
			System.out.println("이디야");
			
		}else {
			System.out.println("물");
		}

	}*/
		//입력
		String ice = JOptionPane.showInputDialog("음료를 선택하세여");		
		//처리
		String result ="";
		if(ice.equals("아이스크림")){ 
			result="뚜레쥬르";
			
		}else if(ice.equals("아이스커피")) {
			result="이디야";
			
		}else {
			result="물";
		}
		//결과
		System.out.println(result);
		
	}

}
