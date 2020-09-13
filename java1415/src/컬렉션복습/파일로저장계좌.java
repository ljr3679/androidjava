package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장계좌 {
	
	public void save(ArrayList<계좌> list) {
		//외부에서 데이터를 받아서 파일로 저장
		System.out.println(list.size() + "일지가 넘어왔음.");
		for (int i = 0; i < list.size(); i++) {
			//컨테이너역할인 list에서 하나씩 꺼내는 부분
			계좌 account = list.get(i);
			System.out.println(account);
			System.out.println("-------------------------");
			//파일로 저장할 예정->예외처리
			try {
				//파일을 만들어서 저장하는 부품을 써야함.
				FileWriter w= new FileWriter(account.name + ".txt");
				w.write(account.name + "\n");
				w.write(account.field + "\n");
				w.write(account.money + "\n");
				w.close();//파일에다가 다 썼음.
			} catch (Exception e) {
				//try 내에 있는 코드에서 에러가 발생했을 때, 대응처리 내용을 써줌.
				System.out.println("파일로 저장하다가 에러가 발생함!!");
			}
		}
	}
}
