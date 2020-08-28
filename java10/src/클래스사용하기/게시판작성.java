package 클래스사용하기;

import 클래스만들기.Bbs;


public class 게시판작성 {

	public static void main(String[] args) {
		
		Bbs t1 = new Bbs();
		t1.id = 1;
		t1.title = "java";
		t1.content = "fun java";
		t1.writer = "park";
		
		Bbs t2 = new Bbs();
		t2.id = 2;
		t2.title = "jsp";
		t2.content = "fun jsp";
		t2.writer = "kim";
		
		System.out.println(t1.id + "  " + t1.title + "  "  + t1.content + "  "  + t1.writer);
		System.out.println(t2.id + "  " + t2.title + "  "  + t2.content + "  "  + t2.writer);
		
	}

}
