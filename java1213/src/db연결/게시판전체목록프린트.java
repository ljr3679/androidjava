package db연결;

import java.util.ArrayList;

public class 게시판전체목록프린트 {

	public static void main(String[] args) throws Exception {
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.all();
		System.out.println("게시판의 개수 : " + list.size() + "개");
		for (int i = 0; i < list.size(); i++) {//4
			BbsVO bag = list.get(i);
			System.out.println("NO : " + bag.getNo());
			System.out.println("Title : " + bag.getTitle());
			System.out.println("Content : " + bag.getContent());
			System.out.println("Writer : " + bag.getWriter());
			System.out.println();
			
		}

	}

}
