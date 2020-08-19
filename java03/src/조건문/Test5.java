package 조건문;

import javax.swing.JOptionPane;

public class Test5 {
	int st12 = 0, no12 = 0, to=0 ;
	public static void main(String[] args) {
		String st1 = JOptionPane.showInputDialog("스티커갯수");
		int st11 = Integer.parseInt(st1);
		System.out.println("스티커갯수"+st11);
		int st12 = st11*1000;
		System.out.println("가격은"+st12);
		
		String no1 = JOptionPane.showInputDialog("노트갯수");
		int no11 = Integer.parseInt(no1);
		System.out.println("노트갯수"+no11);
		int no12 = no11*1000;
		System.out.println("가격은"+no12);
		
		int to = st12 + no12;
		System.out.println("총가격은"+to);
		
		if ( to > 25000 ) {
			System.out.println("3000원 할인"+(to-3000));
		}else {
			System.out.println("정상가격"+to);
		}
		
	}

}
